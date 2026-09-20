package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo2 implements Comparable<wo2> {
    public static int A = 1;
    public final yy1 w;
    public final yy1 x;
    public final dl3 y;
    public final jy1 z;

    public static final class CQf extends cx1 implements j81<yy1, Boolean> {
        public final /* synthetic */ dl3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(dl3 dl3Var) {
            super(1);
            this.w = dl3Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            kz1 kz1VarG = ps0.G(yy1Var);
            return Boolean.valueOf(kz1VarG.q() && !ur1.a(this.w, ps0.o(kz1VarG)));
        }
    }

    public static final class QnHx extends cx1 implements j81<yy1, Boolean> {
        public final /* synthetic */ dl3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(dl3 dl3Var) {
            super(1);
            this.w = dl3Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            kz1 kz1VarG = ps0.G(yy1Var);
            return Boolean.valueOf(kz1VarG.q() && !ur1.a(this.w, ps0.o(kz1VarG)));
        }
    }

    public wo2(yy1 yy1Var, yy1 yy1Var2) {
        this.w = yy1Var;
        this.x = yy1Var2;
        this.z = yy1Var.N;
        kz1 kz1VarG = ps0.G(yy1Var2);
        pn1 pn1Var = yy1Var.Y;
        this.y = (pn1Var.q() && kz1VarG.q()) ? pn1Var.N(kz1VarG, true) : null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wo2 wo2Var) {
        dl3 dl3Var = this.y;
        if (dl3Var == null) {
            return 1;
        }
        dl3 dl3Var2 = wo2Var.y;
        if (dl3Var2 == null) {
            return -1;
        }
        int i = A;
        float f = dl3Var.b;
        float f2 = dl3Var.d;
        float f3 = dl3Var2.d;
        float f4 = dl3Var2.b;
        if (i == 1) {
            if (f2 - f4 <= 0.0f) {
                return -1;
            }
            if (f - f3 >= 0.0f) {
                return 1;
            }
        }
        jy1 jy1Var = jy1.Ltr;
        jy1 jy1Var2 = this.z;
        float f5 = dl3Var.a;
        float f6 = dl3Var.c;
        float f7 = dl3Var2.a;
        float f8 = dl3Var2.c;
        if (jy1Var2 == jy1Var) {
            float f9 = f5 - f7;
            if (!(f9 == 0.0f)) {
                return f9 < 0.0f ? -1 : 1;
            }
        } else {
            float f10 = f6 - f8;
            if (!(f10 == 0.0f)) {
                return f10 < 0.0f ? 1 : -1;
            }
        }
        float f11 = f - f4;
        if (!(f11 == 0.0f)) {
            return f11 < 0.0f ? -1 : 1;
        }
        float f12 = (f2 - f) - (f3 - f4);
        if (!(f12 == 0.0f)) {
            return f12 < 0.0f ? 1 : -1;
        }
        float f13 = (f6 - f5) - (f8 - f7);
        if (!(f13 == 0.0f)) {
            return f13 < 0.0f ? 1 : -1;
        }
        yy1 yy1Var = this.x;
        dl3 dl3VarO = ps0.o(ps0.G(yy1Var));
        yy1 yy1Var2 = wo2Var.x;
        dl3 dl3VarO2 = ps0.o(ps0.G(yy1Var2));
        yy1 yy1VarD = ps0.D(yy1Var, new QnHx(dl3VarO));
        yy1 yy1VarD2 = ps0.D(yy1Var2, new CQf(dl3VarO2));
        if (yy1VarD == null || yy1VarD2 == null) {
            return yy1VarD != null ? 1 : -1;
        }
        return new wo2(this.w, yy1VarD).compareTo(new wo2(wo2Var.w, yy1VarD2));
    }
}
