package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes3.dex */
public final class rd extends FloatingActionButton.QnHx {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public class QnHx extends FloatingActionButton.QnHx {
        public QnHx() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.QnHx
        public final void b() {
            BottomAppBar bottomAppBar = rd.this.b;
            int i = BottomAppBar.u0;
            bottomAppBar.getClass();
        }
    }

    public rd(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.QnHx
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.u(this.a));
        floatingActionButton.k(new QnHx(), true);
    }
}
