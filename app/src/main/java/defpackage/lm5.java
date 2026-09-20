package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class lm5 {
    public final NUlFixed a;

    public static class CQf extends QnHx {
        public CQf(View view, Window window) {
            super(view, window);
        }

        @Override // lm5.NUlFixed
        public final boolean a() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // lm5.NUlFixed
        public final void b(boolean z) {
            Window window = this.a;
            if (!z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            } else {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
            }
        }
    }

    public static class F1 extends CQf {
        public F1(View view, Window window) {
            super(view, window);
        }
    }

    public static class LPt8Fixed extends NUlFixed {
        public final WindowInsetsController a;
        public final Window b;

        public LPt8Fixed(Window window) {
            WindowInsetsController insetsController = window.getInsetsController();
            new ok4();
            this.a = insetsController;
            this.b = window;
        }

        @Override // lm5.NUlFixed
        public final boolean a() {
            return (this.a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // lm5.NUlFixed
        public final void b(boolean z) {
            WindowInsetsController windowInsetsController = this.a;
            Window window = this.b;
            if (z) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    public static class NUlFixed {
        public boolean a() {
            return false;
        }

        public void b(boolean z) {
        }
    }

    public static class QnHx extends NUlFixed {
        public final Window a;
        public final View b;

        public QnHx(View view, Window window) {
            this.a = window;
            this.b = view;
        }
    }

    public lm5(View view, Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new LPt8Fixed(window);
            return;
        }
        if (i >= 26) {
            this.a = new F1(view, window);
        } else if (i >= 23) {
            this.a = new CQf(view, window);
        } else {
            this.a = new QnHx(view, window);
        }
    }
}
