package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ib3 {
    public static final kj1<ib3> d;
    public static final kj1<ib3> e;
    public static final kj1<ib3> f;
    public final int a;
    public final Integer b;
    public final ej1 c;

    static {
        ib3[] ib3VarArr = new ib3[4];
        ib3VarArr[0] = new ib3(R.string.premium_feature_multi_session_title, Integer.valueOf(R.string.premium_feature_multi_session_description), qLd.f());
        Integer numValueOf = Integer.valueOf(R.string.premium_feature_notification_description);
        ej1 ej1VarD = m21.S;
        if (ej1VarD == null) {
            ej1.QnHx qnHx = new ej1.QnHx("Outlined.PlayCircle");
            int i = sg5.a;
            jq4 jq4Var = new jq4(yu.b);
            le3 le3Var = new le3();
            le3Var.i(12.0f, 2.0f);
            le3Var.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            le3Var.k(4.48f, 10.0f, 10.0f, 10.0f);
            le3Var.k(10.0f, -4.48f, 10.0f, -10.0f);
            le3Var.j(17.52f, 2.0f, 12.0f, 2.0f);
            le3Var.b();
            le3Var.i(12.0f, 20.0f);
            le3Var.d(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
            le3Var.k(3.59f, -8.0f, 8.0f, -8.0f);
            le3Var.k(8.0f, 3.59f, 8.0f, 8.0f);
            le3Var.j(16.41f, 20.0f, 12.0f, 20.0f);
            le3Var.b();
            le3Var.i(9.5f, 16.5f);
            le3Var.h(7.0f, -4.5f);
            le3Var.h(-7.0f, -4.5f);
            le3Var.m(16.5f);
            le3Var.b();
            qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
            ej1VarD = qnHx.d();
            m21.S = ej1VarD;
        }
        ib3VarArr[1] = new ib3(R.string.premium_feature_notification_title, numValueOf, ej1VarD);
        ib3VarArr[2] = new ib3(R.string.premium_feature_audio_quality_title, Integer.valueOf(R.string.premium_feature_audio_quality_description), kd.p());
        Integer numValueOf2 = Integer.valueOf(R.string.premium_feature_buffer_size_description);
        ej1 ej1VarD2 = CXJ.j;
        if (ej1VarD2 == null) {
            ej1.QnHx qnHx2 = new ej1.QnHx("Outlined.Settings");
            int i2 = sg5.a;
            jq4 jq4Var2 = new jq4(yu.b);
            le3 le3Var2 = new le3();
            le3Var2.i(19.43f, 12.98f);
            le3Var2.d(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
            le3Var2.d(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
            le3Var2.h(2.11f, -1.65f);
            le3Var2.d(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
            le3Var2.h(-2.0f, -3.46f);
            le3Var2.d(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
            le3Var2.d(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
            le3Var2.h(-2.49f, 1.0f);
            le3Var2.d(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
            le3Var2.h(-0.38f, -2.65f);
            le3Var2.c(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
            le3Var2.f(-4.0f);
            le3Var2.d(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
            le3Var2.h(-0.38f, 2.65f);
            le3Var2.d(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
            le3Var2.h(-2.49f, -1.0f);
            le3Var2.d(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
            le3Var2.d(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
            le3Var2.h(-2.0f, 3.46f);
            le3Var2.d(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
            le3Var2.h(2.11f, 1.65f);
            le3Var2.d(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
            le3Var2.d(0.0f, 0.33f, 0.03f, 0.66f, 0.07f, 0.98f);
            le3Var2.h(-2.11f, 1.65f);
            le3Var2.d(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
            le3Var2.h(2.0f, 3.46f);
            le3Var2.d(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
            le3Var2.d(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
            le3Var2.h(2.49f, -1.0f);
            le3Var2.d(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
            le3Var2.h(0.38f, 2.65f);
            le3Var2.d(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
            le3Var2.f(4.0f);
            le3Var2.d(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
            le3Var2.h(0.38f, -2.65f);
            le3Var2.d(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
            le3Var2.h(2.49f, 1.0f);
            le3Var2.d(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
            le3Var2.d(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
            le3Var2.h(2.0f, -3.46f);
            le3Var2.d(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
            le3Var2.h(-2.11f, -1.65f);
            le3Var2.b();
            le3Var2.i(17.45f, 11.27f);
            le3Var2.d(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
            le3Var2.d(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
            le3Var2.h(-0.14f, 1.13f);
            le3Var2.h(0.89f, 0.7f);
            le3Var2.h(1.08f, 0.84f);
            le3Var2.h(-0.7f, 1.21f);
            le3Var2.h(-1.27f, -0.51f);
            le3Var2.h(-1.04f, -0.42f);
            le3Var2.h(-0.9f, 0.68f);
            le3Var2.d(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
            le3Var2.h(-1.06f, 0.43f);
            le3Var2.h(-0.16f, 1.13f);
            le3Var2.h(-0.2f, 1.35f);
            le3Var2.f(-1.4f);
            le3Var2.h(-0.19f, -1.35f);
            le3Var2.h(-0.16f, -1.13f);
            le3Var2.h(-1.06f, -0.43f);
            le3Var2.d(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
            le3Var2.h(-0.91f, -0.7f);
            le3Var2.h(-1.06f, 0.43f);
            le3Var2.h(-1.27f, 0.51f);
            le3Var2.h(-0.7f, -1.21f);
            le3Var2.h(1.08f, -0.84f);
            le3Var2.h(0.89f, -0.7f);
            le3Var2.h(-0.14f, -1.13f);
            le3Var2.d(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
            le3Var2.k(0.02f, -0.43f, 0.05f, -0.73f);
            le3Var2.h(0.14f, -1.13f);
            le3Var2.h(-0.89f, -0.7f);
            le3Var2.h(-1.08f, -0.84f);
            le3Var2.h(0.7f, -1.21f);
            le3Var2.h(1.27f, 0.51f);
            le3Var2.h(1.04f, 0.42f);
            le3Var2.h(0.9f, -0.68f);
            le3Var2.d(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
            le3Var2.h(1.06f, -0.43f);
            le3Var2.h(0.16f, -1.13f);
            le3Var2.h(0.2f, -1.35f);
            le3Var2.f(1.39f);
            le3Var2.h(0.19f, 1.35f);
            le3Var2.h(0.16f, 1.13f);
            le3Var2.h(1.06f, 0.43f);
            le3Var2.d(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
            le3Var2.h(0.91f, 0.7f);
            le3Var2.h(1.06f, -0.43f);
            le3Var2.h(1.27f, -0.51f);
            le3Var2.h(0.7f, 1.21f);
            le3Var2.h(-1.07f, 0.85f);
            le3Var2.h(-0.89f, 0.7f);
            le3Var2.h(0.14f, 1.13f);
            le3Var2.b();
            le3Var2.i(12.0f, 8.0f);
            le3Var2.d(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
            le3Var2.k(1.79f, 4.0f, 4.0f, 4.0f);
            le3Var2.k(4.0f, -1.79f, 4.0f, -4.0f);
            le3Var2.k(-1.79f, -4.0f, -4.0f, -4.0f);
            le3Var2.b();
            le3Var2.i(12.0f, 14.0f);
            le3Var2.d(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
            le3Var2.k(0.9f, -2.0f, 2.0f, -2.0f);
            le3Var2.k(2.0f, 0.9f, 2.0f, 2.0f);
            le3Var2.k(-0.9f, 2.0f, -2.0f, 2.0f);
            le3Var2.b();
            qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var2.a);
            ej1VarD2 = qnHx2.d();
            CXJ.j = ej1VarD2;
        }
        ib3VarArr[3] = new ib3(R.string.premium_feature_buffer_size_title, numValueOf2, ej1VarD2);
        d = new kj1<>(ps0.M(ib3VarArr));
        e = new kj1<>(ps0.M(new ib3(R.string.premium_feature_server_multi_session_title, Integer.valueOf(R.string.premium_feature_server_multi_session_description), qLd.f()), new ib3(R.string.premium_feature_server_unlimited_time_title, Integer.valueOf(R.string.premium_feature_server_unlimited_time_description), iE.h()), new ib3(R.string.premium_feature_mic_noise_suppression_title, Integer.valueOf(R.string.premium_feature_mic_noise_suppression_description), FWT.y())));
        ib3[] ib3VarArr2 = new ib3[2];
        ej1 ej1VarD3 = FNO9.x;
        if (ej1VarD3 == null) {
            ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.Block");
            int i3 = sg5.a;
            jq4 jq4Var3 = new jq4(yu.b);
            le3 le3Var3 = new le3();
            le3Var3.i(12.0f, 2.0f);
            le3Var3.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            le3Var3.k(4.48f, 10.0f, 10.0f, 10.0f);
            le3Var3.k(10.0f, -4.48f, 10.0f, -10.0f);
            le3Var3.j(17.52f, 2.0f, 12.0f, 2.0f);
            le3Var3.b();
            le3Var3.i(4.0f, 12.0f);
            le3Var3.d(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
            le3Var3.d(1.85f, 0.0f, 3.55f, 0.63f, 4.9f, 1.69f);
            le3Var3.g(5.69f, 16.9f);
            le3Var3.c(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
            le3Var3.b();
            le3Var3.i(12.0f, 20.0f);
            le3Var3.d(-1.85f, 0.0f, -3.55f, -0.63f, -4.9f, -1.69f);
            le3Var3.g(18.31f, 7.1f);
            le3Var3.c(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
            le3Var3.d(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
            le3Var3.b();
            qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var3, null, "", le3Var3.a);
            ej1VarD3 = qnHx3.d();
            FNO9.x = ej1VarD3;
        }
        ib3VarArr2[0] = new ib3(R.string.premium_feature_ads_title, null, ej1VarD3);
        ib3VarArr2[1] = new ib3(R.string.premium_feature_support_title, null, g7.c());
        f = new kj1<>(ps0.M(ib3VarArr2));
    }

    public ib3(int i, Integer num, ej1 ej1Var) {
        this.a = i;
        this.b = num;
        this.c = ej1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3Var = (ib3) obj;
        return this.a == ib3Var.a && ur1.a(this.b, ib3Var.b) && ur1.a(this.c, ib3Var.c);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        ej1 ej1Var = this.c;
        return iHashCode + (ej1Var != null ? ej1Var.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumFeature(featureTitleId=" + this.a + ", featureDescriptionId=" + this.b + ", icon=" + this.c + ")";
    }
}
