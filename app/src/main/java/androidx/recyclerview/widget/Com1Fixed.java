package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Com1Fixed {
    public final CQf a;
    public final QnHx b = new QnHx();

    public interface CQf {
        int a(View view);

        int b();

        int c();

        View d(int i);

        int e(View view);
    }

    public static class QnHx {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i;
            int i2;
            int i3;
            int i4 = this.a;
            int i5 = 2;
            if ((i4 & 7) != 0) {
                int i6 = this.d;
                int i7 = this.b;
                if (i6 > i7) {
                    i3 = 1;
                } else {
                    i3 = i6 == i7 ? 2 : 4;
                }
                if (((i3 << 0) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 112) != 0) {
                int i8 = this.d;
                int i9 = this.c;
                if (i8 > i9) {
                    i2 = 1;
                } else {
                    i2 = i8 == i9 ? 2 : 4;
                }
                if (((i2 << 4) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 1792) != 0) {
                int i10 = this.e;
                int i11 = this.b;
                if (i10 > i11) {
                    i = 1;
                } else {
                    i = i10 == i11 ? 2 : 4;
                }
                if (((i << 8) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 28672) != 0) {
                int i12 = this.e;
                int i13 = this.c;
                if (i12 > i13) {
                    i5 = 1;
                } else if (i12 != i13) {
                    i5 = 4;
                }
                if ((i4 & (i5 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public Com1Fixed(CQf cQf) {
        this.a = cQf;
    }

    public final View a(int i, int i2, int i3, int i4) {
        CQf cQf = this.a;
        int iB = cQf.b();
        int iC = cQf.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewD = cQf.d(i);
            int iA = cQf.a(viewD);
            int iE = cQf.e(viewD);
            QnHx qnHx = this.b;
            qnHx.b = iB;
            qnHx.c = iC;
            qnHx.d = iA;
            qnHx.e = iE;
            if (i3 != 0) {
                qnHx.a = i3 | 0;
                if (qnHx.a()) {
                    return viewD;
                }
            }
            if (i4 != 0) {
                qnHx.a = i4 | 0;
                if (qnHx.a()) {
                    view = viewD;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        CQf cQf = this.a;
        int iB = cQf.b();
        int iC = cQf.c();
        int iA = cQf.a(view);
        int iE = cQf.e(view);
        QnHx qnHx = this.b;
        qnHx.b = iB;
        qnHx.c = iC;
        qnHx.d = iA;
        qnHx.e = iE;
        qnHx.a = 24579 | 0;
        return qnHx.a();
    }
}
