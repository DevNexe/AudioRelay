package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class bt1 {
    public static final CQf Companion = new CQf();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public static final class CQf {
        public final rv1<bt1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<bt1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("bt1", qnHx, 7);
            u83Var.l("mainMopubBanner", false);
            u83Var.l("mainAdmobBanner", false);
            u83Var.l("adsFragmentMopubNative", false);
            u83Var.l("adsFragmentAdmobNative", false);
            u83Var.l("adsFragmentAdmobRectangle", true);
            u83Var.l("endSessionInterstitialMopub", true);
            u83Var.l("endSessionInterstitialAdMob", true);
            b = u83Var;
        }

        @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
        public final pa4 a() {
            return b;
        }

        @Override // defpackage.y91
        public final void b() {
        }

        @Override // defpackage.zj0
        public final Object c(pf0 pf0Var) {
            u83 u83Var = b;
            g40 g40VarB = pf0Var.b(u83Var);
            g40VarB.b0();
            Object objO0 = null;
            Object objO1 = null;
            Object objO2 = null;
            String strA = null;
            String strA2 = null;
            String strA3 = null;
            String strA4 = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iP = g40VarB.p(u83Var);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strA4 = g40VarB.A(u83Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        objO1 = g40VarB.o0(u83Var, 4, wu4.a, objO1);
                        i |= 16;
                        break;
                    case 5:
                        objO2 = g40VarB.o0(u83Var, 5, wu4.a, objO2);
                        i |= 32;
                        break;
                    case 6:
                        objO0 = g40VarB.o0(u83Var, 6, wu4.a, objO0);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iP);
                }
            }
            g40VarB.G(u83Var);
            return new bt1(i, strA, strA2, strA3, strA4, (String) objO1, (String) objO2, (String) objO0);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            wu4 wu4Var = wu4.a;
            return new rv1[]{wu4Var, wu4Var, wu4Var, wu4Var, ii.b(wu4Var), ii.b(wu4Var), ii.b(wu4Var)};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            bt1 bt1Var = (bt1) obj;
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            eu1VarB.c0(u83Var, 0, bt1Var.a);
            eu1VarB.c0(u83Var, 1, bt1Var.b);
            eu1VarB.c0(u83Var, 2, bt1Var.c);
            eu1VarB.c0(u83Var, 3, bt1Var.d);
            boolean zM0 = eu1VarB.m0();
            Object obj2 = bt1Var.e;
            if (zM0 || obj2 != null) {
                eu1VarB.B(u83Var, 4, wu4.a, obj2);
            }
            boolean zM1 = eu1VarB.m0();
            Object obj3 = bt1Var.f;
            if (zM1 || obj3 != null) {
                eu1VarB.B(u83Var, 5, wu4.a, obj3);
            }
            boolean zM2 = eu1VarB.m0();
            Object obj4 = bt1Var.g;
            if (zM2 || obj4 != null) {
                eu1VarB.B(u83Var, 6, wu4.a, obj4);
            }
            eu1VarB.k();
        }
    }

    public bt1(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (15 != (i & 15)) {
            AY.P(i, 15, QnHx.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        return ur1.a(this.a, bt1Var.a) && ur1.a(this.b, bt1Var.b) && ur1.a(this.c, bt1Var.c) && ur1.a(this.d, bt1Var.d) && ur1.a(this.e, bt1Var.e) && ur1.a(this.f, bt1Var.f) && ur1.a(this.g, bt1Var.g);
    }

    public final int hashCode() {
        int iA = bl2.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonAdUnitIds(mainMopubBanner=");
        sb.append(this.a);
        sb.append(", mainAdmobBanner=");
        sb.append(this.b);
        sb.append(", adsFragmentMopubNative=");
        sb.append(this.c);
        sb.append(", adsFragmentAdmobNative=");
        sb.append(this.d);
        sb.append(", adsFragmentAdmobRectangle=");
        sb.append(this.e);
        sb.append(", endSessionInterstitialMopub=");
        sb.append(this.f);
        sb.append(", endSessionInterstitialAdMob=");
        return i5.b(sb, this.g, ")");
    }
}
