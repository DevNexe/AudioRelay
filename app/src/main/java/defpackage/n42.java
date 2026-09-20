package defpackage;

import androidx.lifecycle.LPt6Fixed;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class n42 extends B8C {
    public final d32 w;
    public final CQf x;

    public static class CQf extends jj5 {
        public static final QnHx e = new QnHx();
        public final wq4<QnHx> d = new wq4<>();

        public static class QnHx implements LPt6Fixed.CQf {
            @Override // androidx.lifecycle.LPt6Fixed.CQf
            public final <T extends jj5> T a(Class<T> cls) {
                return new CQf();
            }

            @Override // androidx.lifecycle.LPt6Fixed.CQf
            public final jj5 b(Class cls, bi2 bi2Var) {
                return new CQf();
            }
        }

        @Override // defpackage.jj5
        public final void c() {
            wq4<QnHx> wq4Var = this.d;
            if (wq4Var.k() > 0) {
                wq4Var.l(0).getClass();
                throw null;
            }
            int i = wq4Var.z;
            Object[] objArr = wq4Var.y;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            wq4Var.z = 0;
            wq4Var.w = false;
        }
    }

    public static class QnHx<D> extends fi2<D> {
        @Override // androidx.lifecycle.LiveData
        public final void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void g(it2<? super D> it2Var) {
            super.g(it2Var);
        }

        @Override // defpackage.fi2, androidx.lifecycle.LiveData
        public final void h(D d) {
            super.h(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            C0239D.i(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public n42(d32 d32Var, lj5 lj5Var) {
        this.w = d32Var;
        this.x = (CQf) new LPt6Fixed(lj5Var, CQf.e, 0).a(CQf.class);
    }

    @Deprecated
    public final void V0(String str, PrintWriter printWriter) {
        wq4<QnHx> wq4Var = this.x.d;
        if (wq4Var.k() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (wq4Var.k() <= 0) {
                return;
            }
            QnHx qnHxL = wq4Var.l(0);
            printWriter.print(str);
            printWriter.print("  #");
            if (wq4Var.w) {
                wq4Var.h();
            }
            printWriter.print(wq4Var.x[0]);
            printWriter.print(": ");
            printWriter.println(qnHxL.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0239D.i(this.w, sb);
        sb.append("}}");
        return sb.toString();
    }
}
