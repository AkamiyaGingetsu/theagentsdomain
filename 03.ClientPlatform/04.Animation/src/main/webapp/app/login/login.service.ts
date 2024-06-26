import { Injectable } from '@angular/core';
import { Location } from '@angular/common';

import { AuthServerProvider } from 'app/core/auth/auth-session.service';
import { Logout } from './logout.model';

@Injectable({ providedIn: 'root' })
export class LoginService {
  constructor(
    private location: Location,
    private authServerProvider: AuthServerProvider,
  ) {}

  login(): void {
    // If you have configured multiple OIDC providers, then, you can update this URL to /login.
    // It will show a Spring Security generated login page with links to configured OIDC providers.
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/oidc')}`;
  }
  loginWithUserInfo(userid:string,password:string): void {
    // If you have configured multiple OIDC providers, then, you can update this URL to /login.
    // It will show a Spring Security generated login page with links to configured OIDC providers.
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/oidc')}`;
  }
  signup(userid:string,password:string): void {
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/oidc')}?kc_action=register`;
  }
  // src/main/webapp/app/core/auth/auth.service.ts

  loginWithGoogle(): void {
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/oidc')}`;
  }

  loginWithApple(): void {
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/oidc')}`;
  }
  loginWithOpenaiPlus(): void {
    location.href = `${location.origin}${this.location.prepareExternalUrl('oauth2/authorization/openaiplus')}`;
  }

  logout(): void {
    this.authServerProvider.logout().subscribe((logout: Logout) => {
      window.location.href = logout.logoutUrl;
    });
  }
}
