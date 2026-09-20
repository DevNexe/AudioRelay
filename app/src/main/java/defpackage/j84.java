package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j84 {

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[eb1.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long a(b84 b84Var, long j, n74.QnHx qnHx, boolean z) {
        k74 k74VarB = b84Var.b(qnHx);
        if (k74VarB == null) {
            return kt2.d;
        }
        iy1 iy1Var = b84Var.j;
        if (iy1Var == null) {
            return kt2.d;
        }
        iy1 iy1VarF = k74VarB.f();
        if (iy1VarF == null) {
            return kt2.d;
        }
        int i = qnHx.b;
        if (!z) {
            i--;
        }
        float fC = kt2.c(iy1VarF.L(iy1Var, ((kt2) b84Var.p.getValue()).a));
        long jG = k74VarB.g(i);
        dl3 dl3VarA = k74VarB.a(s55.e(jG));
        int iD = s55.d(jG) - 1;
        int iE = s55.e(jG);
        if (iD < iE) {
            iD = iE;
        }
        dl3 dl3VarA2 = k74VarB.a(iD);
        float fN = AY.n(fC, Math.min(dl3VarA.a, dl3VarA2.a), Math.max(dl3VarA.c, dl3VarA2.c));
        return Math.abs(fC - fN) > ((float) (((int) (j >> 32)) / 2)) ? kt2.d : iy1Var.L(iy1VarF, X.a(fN, kt2.d(k74VarB.a(i).b())));
    }

    public static final boolean b(long j, dl3 dl3Var) {
        float fC = kt2.c(j);
        if (!(dl3Var.a <= fC && fC <= dl3Var.c)) {
            return false;
        }
        float fD = kt2.d(j);
        return (dl3Var.b > fD ? 1 : (dl3Var.b == fD ? 0 : -1)) <= 0 && (fD > dl3Var.d ? 1 : (fD == dl3Var.d ? 0 : -1)) <= 0;
    }

    public static final n74 c(n74 n74Var, n74 n74Var2) {
        if (n74Var == null) {
            return n74Var2;
        }
        if (n74Var2 != null) {
            boolean z = n74Var.c;
            n74Var = z ? new n74(n74Var2.a, n74Var.b, z) : new n74(n74Var.a, n74Var2.b, z);
        }
        return n74Var;
    }

    public static final dl3 d(iy1 iy1Var) {
        iy1 iy1VarF = ps0.F(iy1Var);
        dl3 dl3VarN = ps0.F(iy1Var).N(iy1Var, true);
        float f = dl3VarN.a;
        float f2 = dl3VarN.b;
        long jL = iy1VarF.l(X.a(f, f2));
        float f3 = dl3VarN.c;
        long jL2 = iy1VarF.l(X.a(f3, f2));
        float f4 = dl3VarN.d;
        long jL3 = iy1VarF.l(X.a(f3, f4));
        long jL4 = iy1VarF.l(X.a(dl3VarN.a, f4));
        float fC = kt2.c(jL);
        float[] fArr = {kt2.c(jL2), kt2.c(jL4), kt2.c(jL3)};
        for (int i = 0; i < 3; i++) {
            fC = Math.min(fC, fArr[i]);
        }
        float fD = kt2.d(jL);
        float[] fArr2 = {kt2.d(jL2), kt2.d(jL4), kt2.d(jL3)};
        for (int i2 = 0; i2 < 3; i2++) {
            fD = Math.min(fD, fArr2[i2]);
        }
        float fC2 = kt2.c(jL);
        float[] fArr3 = {kt2.c(jL2), kt2.c(jL4), kt2.c(jL3)};
        for (int i3 = 0; i3 < 3; i3++) {
            fC2 = Math.max(fC2, fArr3[i3]);
        }
        float fD2 = kt2.d(jL);
        float[] fArr4 = {kt2.d(jL2), kt2.d(jL4), kt2.d(jL3)};
        for (int i4 = 0; i4 < 3; i4++) {
            fD2 = Math.max(fD2, fArr4[i4]);
        }
        long jZ = iy1Var.z(X.a(fC, fD));
        long jZ2 = iy1Var.z(X.a(fC2, fD2));
        return new dl3(kt2.c(jZ), kt2.d(jZ), kt2.c(jZ2), kt2.d(jZ2));
    }
}
