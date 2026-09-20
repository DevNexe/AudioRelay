package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h60 {
    public final fv a;
    public final fv b;
    public final float[] c;

    public static final class QnHx extends h60 {
        public final js3 d;
        public final js3 e;
        public final float[] f;

        public QnHx(js3 js3Var, js3 js3Var2, int i) {
            float[] fArrM0;
            super(js3Var, js3Var2, (float[]) null);
            this.d = js3Var;
            this.e = js3Var2;
            am5 am5Var = js3Var.d;
            am5 am5Var2 = js3Var2.d;
            boolean zM = fp1.M(am5Var, am5Var2);
            float[] fArrM1 = js3Var.i;
            float[] fArr = js3Var2.j;
            if (zM) {
                fArrM0 = fp1.m0(fArr, fArrM1);
            } else {
                am5 am5Var3 = js3Var.d;
                float[] fArrA = am5Var3.a();
                float[] fArrA2 = am5Var2.a();
                am5 am5Var4 = CXJ.f;
                boolean zM2 = fp1.M(am5Var3, am5Var4);
                float[] fArr2 = CXJ.i;
                float[] fArr3 = KWBB.b.a;
                fArrM1 = zM2 ? fArrM1 : fp1.m0(fp1.J(fArr3, fArrA, Arrays.copyOf(fArr2, 3)), fArrM1);
                fArrM0 = fp1.m0(fp1.M(am5Var2, am5Var4) ? fArr : fp1.d0(fp1.m0(fp1.J(fArr3, fArrA2, Arrays.copyOf(fArr2, 3)), js3Var2.i)), i == 3 ? fp1.n0(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrM1) : fArrM1);
            }
            this.f = fArrM0;
        }

        @Override // defpackage.h60
        public final void a(float[] fArr) {
            js3 js3Var = this.d;
            fArr[0] = (float) ((Number) js3Var.n.invoke(Double.valueOf(fArr[0]))).doubleValue();
            Double dValueOf = Double.valueOf(fArr[1]);
            js3.byN byn = js3Var.n;
            fArr[1] = (float) ((Number) byn.invoke(dValueOf)).doubleValue();
            fArr[2] = (float) ((Number) byn.invoke(Double.valueOf(fArr[2]))).doubleValue();
            fp1.o0(this.f, fArr);
            js3 js3Var2 = this.e;
            fArr[0] = (float) ((Number) js3Var2.l.invoke(Double.valueOf(fArr[0]))).doubleValue();
            Double dValueOf2 = Double.valueOf(fArr[1]);
            js3.EQ eq = js3Var2.l;
            fArr[1] = (float) ((Number) eq.invoke(dValueOf2)).doubleValue();
            fArr[2] = (float) ((Number) eq.invoke(Double.valueOf(fArr[2]))).doubleValue();
        }
    }

    public h60(fv fvVar, fv fvVar2, float[] fArr) {
        this.a = fvVar;
        this.b = fvVar2;
        this.c = fArr;
    }

    public void a(float[] fArr) {
        float[] fArrE = this.a.e(fArr);
        float[] fArr2 = this.c;
        if (fArr2 != null) {
            fArrE[0] = fArrE[0] * fArr2[0];
            fArrE[1] = fArrE[1] * fArr2[1];
            fArrE[2] = fArrE[2] * fArr2[2];
        }
        this.b.a(fArrE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public h60(fv fvVar, fv fvVar2, int i) {
        float[] fArr;
        long j = fvVar.b;
        long j2 = dv.a;
        fv fvVarB = dv.a(j, j2) ? fp1.B(fvVar) : fvVar;
        fv fvVarB2 = dv.a(fvVar2.b, j2) ? fp1.B(fvVar2) : fvVar2;
        if (i == 3) {
            boolean zA = dv.a(fvVar.b, j2);
            boolean zA2 = dv.a(fvVar2.b, j2);
            if (!(zA && zA2) && (zA || zA2)) {
                fvVar = zA ? fvVar : fvVar2;
                float[] fArrA = CXJ.i;
                am5 am5Var = ((js3) fvVar).d;
                float[] fArrA2 = zA ? am5Var.a() : fArrA;
                fArrA = zA2 ? am5Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(fvVarB, fvVarB2, fArr);
    }
}
