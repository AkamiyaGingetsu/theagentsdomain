import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { FootMenuComponent } from 'app/layouts/foot-menu/foot-menu.component';
import SharedModule from 'app/shared/shared.module';

@Component({
  selector: 'jhi-createxplainer-prompt',
  standalone: true,
  imports: [SharedModule, RouterModule,FootMenuComponent],
  templateUrl: './createExplainerPrompt.html',
  styleUrl: './createExplainerPromptStyles.scss'
})
export class CreatexplainerPromptComponent {
  constructor(
    public router: Router
    ){
      
    }
  continue() {
    this.router.navigate(['/ThinkingScreen']);
  }

}
