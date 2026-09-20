package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import defpackage.C0239D;
import defpackage.ce2;
import defpackage.de2;
import defpackage.lr0;

/* JADX INFO: loaded from: classes.dex */
public final class T23 {
    public final de2 a;
    public final char[] b;
    public final QnHx c = new QnHx(1024);
    public final Typeface d;

    public static class QnHx {
        public final SparseArray<QnHx> a;
        public lr0 b;

        public QnHx() {
            this(1);
        }

        public final void a(lr0 lr0Var, int i, int i2) {
            int iA = lr0Var.a(i);
            SparseArray<QnHx> sparseArray = this.a;
            QnHx qnHx = sparseArray == null ? null : sparseArray.get(iA);
            if (qnHx == null) {
                qnHx = new QnHx();
                sparseArray.put(lr0Var.a(i), qnHx);
            }
            if (i2 > i) {
                qnHx.a(lr0Var, i + 1, i2);
            } else {
                qnHx.b = lr0Var;
            }
        }

        public QnHx(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    public T23(Typeface typeface, de2 de2Var) {
        int i;
        int i2;
        this.d = typeface;
        this.a = de2Var;
        int iA = de2Var.a(6);
        if (iA != 0) {
            int i3 = iA + de2Var.a;
            i = de2Var.b.getInt(de2Var.b.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = de2Var.a(6);
        if (iA2 != 0) {
            int i4 = iA2 + de2Var.a;
            i2 = de2Var.b.getInt(de2Var.b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            lr0 lr0Var = new lr0(this, i5);
            ce2 ce2VarC = lr0Var.c();
            int iA3 = ce2VarC.a(4);
            Character.toChars(iA3 != 0 ? ce2VarC.b.getInt(iA3 + ce2VarC.a) : 0, this.b, i5 * 2);
            C0239D.j("invalid metadata codepoint length", lr0Var.b() > 0);
            this.c.a(lr0Var, 0, lr0Var.b() - 1);
        }
    }
}
