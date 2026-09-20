package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ob implements qf6 {
    public static ej1 w;
    public static ej1 x;
    public static ej1 y;
    public static final /* synthetic */ ob z = new ob();

    public static final ej1 v() {
        ej1 ej1Var = y;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.Warning");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(1.0f, 21.0f);
        le3Var.f(22.0f);
        le3Var.g(12.0f, 2.0f);
        le3Var.g(1.0f, 21.0f);
        le3Var.b();
        le3Var.i(13.0f, 18.0f);
        le3Var.f(-2.0f);
        le3Var.n(-2.0f);
        le3Var.f(2.0f);
        le3Var.n(2.0f);
        le3Var.b();
        le3Var.i(13.0f, 14.0f);
        le3Var.f(-2.0f);
        le3Var.n(-4.0f);
        le3Var.f(2.0f);
        le3Var.n(4.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        y = ej1VarD;
        return ej1VarD;
    }

    public static final m64 w(int i, g30 g30Var, int i2) {
        g30Var.e(-1464256199);
        if ((i2 & 1) != 0) {
            i = 0;
        }
        m64 m64Var = (m64) g7.f(new Object[0], m64.f, null, new d64(i), g30Var, 4);
        g30Var.G();
        return m64Var;
    }

    public static pg2 x(pg2 pg2Var, m64 m64Var) {
        return f30.a(pg2Var, wo1.a, new j64(m64Var, null, true, false));
    }

    public static byte[] y(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzi());
    }
}
