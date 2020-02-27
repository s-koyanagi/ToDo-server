package com.kysh.todo.auth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class AuthConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 埋め込みページ制御を無効化(h2-console用)
        http.headers().frameOptions().disable();

        // 認証周りの設定
        http.authorizeRequests()
                // 認証なしでアクセスできるURL
                .mvcMatchers("/pre_login","/h2-console/**").permitAll()
                // 認証済みでUSERロールを持っているユーザのみアクセスできるURL
                .mvcMatchers("/user/**").hasRole("USER")
                // 認証済みでADMINロールを持っているユーザのみユーザのみアクセスできるURL
                .mvcMatchers("/admin/**").hasRole("ADMIN")
                // その他のURLは認証済みであればアクセスできるURL
                .anyRequest().authenticated()
            .and()
            // アクセス時の例外処理
            .exceptionHandling()
                // TODO:認証が必要なURLに未認証状態でアクセスした場合の処理
//                .authenticationEntryPoint()
                // TODO:認証済で権限がないURLへアクセスした場合の処理
//                .accessDeniedHandler()
            .and()
            // ログイン時の処理
            .formLogin()
                // ログインURLの設定
                .loginProcessingUrl("/login").permitAll()
                // ログインに必要なユーザ名パラメータの指定
//                .usernameParameter("email")
                // ログインに必要なパスワードの設定
//                .passwordParameter("pass")
                // TODO:ログイン成功した場合の処理
//                .successHandler()
                // TODO:ログイン失敗した場合の処理
//                .failureHandler()
            .and()
            // ログアウト時の処理
            .logout()
                // ログアウトURLの設定
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                // TODO:ログアウトが正常終了した場合の処理
//                .logoutSuccessHandler()
            .and()
            // CSRFに関する処理
            .csrf()
                // CSRF無効設定
                .disable();
                // CSRFトークン例外設定
//                .ignoringAntMatchers("/login")
                // CSRFトークン付与の設定
//                .csrfTokenRepository(new CookieCsrfTokenRepository());
    }
}
