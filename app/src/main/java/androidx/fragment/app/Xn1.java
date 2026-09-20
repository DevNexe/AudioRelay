package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Xn1 {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList<String> m;
    public ArrayList<String> n;
    public final ArrayList<QnHx> a = new ArrayList<>();
    public boolean o = false;

    public static final class QnHx {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public androidx.lifecycle.YKK.F1 g;
        public androidx.lifecycle.YKK.F1 h;

        public QnHx() {
        }

        public QnHx(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            androidx.lifecycle.YKK.F1 f1 = androidx.lifecycle.YKK.F1.RESUMED;
            this.g = f1;
            this.h = f1;
        }
    }

    public final void b(QnHx qnHx) {
        this.a.add(qnHx);
        qnHx.c = this.b;
        qnHx.d = this.c;
        qnHx.e = this.d;
        qnHx.f = this.e;
    }
}
