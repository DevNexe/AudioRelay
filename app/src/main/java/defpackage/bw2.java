package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class bw2 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ mv2 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(mv2 mv2Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = mv2Var;
            this.x = pg2Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            bw2.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0776  */
    /* JADX WARN: Code duplicated, block: B:107:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:109:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x022b  */
    /* JADX WARN: Code duplicated, block: B:57:0x023e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0243  */
    /* JADX WARN: Code duplicated, block: B:62:0x024b  */
    /* JADX WARN: Code duplicated, block: B:65:0x031e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0331  */
    /* JADX WARN: Code duplicated, block: B:68:0x0336  */
    /* JADX WARN: Code duplicated, block: B:71:0x033e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0452  */
    /* JADX WARN: Code duplicated, block: B:75:0x0465  */
    /* JADX WARN: Code duplicated, block: B:77:0x046a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0472  */
    /* JADX WARN: Code duplicated, block: B:83:0x052b  */
    /* JADX WARN: Code duplicated, block: B:84:0x053e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0543  */
    /* JADX WARN: Code duplicated, block: B:89:0x054b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0612  */
    /* JADX WARN: Code duplicated, block: B:93:0x0625  */
    /* JADX WARN: Code duplicated, block: B:95:0x062a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0632  */
    public static final void a(mv2 mv2Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        pg2 pg2Var3;
        boolean zI;
        Object objB0;
        qh1 qh1Var;
        ej1 ej1VarD;
        Context context;
        ej1 ej1VarD2;
        Context context2;
        ej1 ej1VarD3;
        Context context3;
        ej1 ej1VarD4;
        Context context4;
        ej1 ej1VarD5;
        Context context5;
        ej1 ej1VarD6;
        Context context6;
        ej1 ej1VarD7;
        Context context7;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-2118149796);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(mv2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf = e40.a;
                j30VarQ.e(1095297563);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(mv2Var);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    switch (mv2Var) {
                        case null:
                            ej1VarD = JUCk.a;
                            if (ej1VarD == null) {
                                ej1.QnHx qnHx = new ej1.QnHx("Outlined.DeviceUnknown");
                                int i5 = sg5.a;
                                jq4 jq4Var = new jq4(yu.b);
                                le3 le3Var = new le3();
                                le3Var.i(17.0f, 1.0f);
                                le3Var.g(7.0f, 1.0f);
                                le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                le3Var.n(18.0f);
                                le3Var.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var.f(10.0f);
                                le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                le3Var.g(19.0f, 3.0f);
                                le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                le3Var.b();
                                le3Var.i(17.0f, 19.0f);
                                le3Var.g(7.0f, 19.0f);
                                le3Var.g(7.0f, 5.0f);
                                le3Var.f(10.0f);
                                le3Var.n(14.0f);
                                le3Var.b();
                                le3Var.i(12.0f, 6.72f);
                                le3Var.d(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
                                le3Var.f(1.75f);
                                le3Var.d(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
                                le3Var.k(1.75f, 0.82f, 1.75f, 1.75f);
                                le3Var.d(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
                                le3Var.f(1.76f);
                                le3Var.d(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
                                le3Var.d(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
                                le3Var.b();
                                le3Var.i(11.0f, 16.0f);
                                le3Var.f(2.0f);
                                le3Var.n(2.0f);
                                le3Var.f(-2.0f);
                                le3Var.n(-2.0f);
                                le3Var.b();
                                qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                                ej1VarD = qnHx.d();
                                JUCk.a = ej1VarD;
                            }
                            qu4.QnHx qnHx2 = qu4.a;
                            context = kd.w;
                            if (context == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD, iZUl.b(qu4.QnHx.b, context, R.string.icon_unknown_accessibility_description));
                            break;
                            break;
                        case 1:
                            ej1VarD2 = ym.E;
                            if (ej1VarD2 == null) {
                                ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.LaptopWindows");
                                int i6 = sg5.a;
                                jq4 jq4Var2 = new jq4(yu.b);
                                le3 le3Var2 = new le3();
                                le3Var2.i(20.0f, 18.0f);
                                le3Var2.n(-1.0f);
                                le3Var2.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                                le3Var2.g(22.0f, 5.0f);
                                le3Var2.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                le3Var2.e(4.0f);
                                le3Var2.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                le3Var2.n(10.0f);
                                le3Var2.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var2.n(1.0f);
                                le3Var2.e(0.0f);
                                le3Var2.n(2.0f);
                                le3Var2.f(24.0f);
                                le3Var2.n(-2.0f);
                                le3Var2.f(-4.0f);
                                le3Var2.b();
                                le3Var2.i(4.0f, 5.0f);
                                le3Var2.f(16.0f);
                                le3Var2.n(10.0f);
                                le3Var2.e(4.0f);
                                le3Var2.m(5.0f);
                                le3Var2.b();
                                qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var2.a);
                                ej1VarD2 = qnHx3.d();
                                ym.E = ej1VarD2;
                            }
                            qu4.QnHx qnHx4 = qu4.a;
                            context2 = kd.w;
                            if (context2 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD2, iZUl.b(qu4.QnHx.b, context2, R.string.icon_windows_accessibility_description));
                            break;
                            break;
                        case 2:
                            ej1VarD3 = ddf.w;
                            if (ej1VarD3 == null) {
                                ej1.QnHx qnHx5 = new ej1.QnHx("Outlined.Laptop");
                                int i7 = sg5.a;
                                jq4 jq4Var3 = new jq4(yu.b);
                                le3 le3Var3 = new le3();
                                le3Var3.i(20.0f, 18.0f);
                                le3Var3.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                le3Var3.m(6.0f);
                                le3Var3.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                le3Var3.e(4.0f);
                                le3Var3.c(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                                le3Var3.n(10.0f);
                                le3Var3.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var3.e(0.0f);
                                le3Var3.n(2.0f);
                                le3Var3.f(24.0f);
                                le3Var3.n(-2.0f);
                                le3Var3.e(20.0f);
                                le3Var3.b();
                                le3Var3.i(4.0f, 6.0f);
                                le3Var3.f(16.0f);
                                le3Var3.n(10.0f);
                                le3Var3.e(4.0f);
                                le3Var3.m(6.0f);
                                le3Var3.b();
                                qnHx5.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var3, null, "", le3Var3.a);
                                ej1VarD3 = qnHx5.d();
                                ddf.w = ej1VarD3;
                            }
                            qu4.QnHx qnHx6 = qu4.a;
                            context3 = kd.w;
                            if (context3 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD3, iZUl.b(qu4.QnHx.b, context3, R.string.icon_linux_accessibility_description));
                            break;
                            break;
                        case 3:
                            ej1VarD4 = fXUx.x;
                            if (ej1VarD4 == null) {
                                ej1.QnHx qnHx7 = new ej1.QnHx("Outlined.LaptopMac");
                                int i8 = sg5.a;
                                jq4 jq4Var4 = new jq4(yu.b);
                                le3 le3Var4 = new le3();
                                le3Var4.i(20.0f, 18.0f);
                                le3Var4.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                                le3Var4.g(22.0f, 5.0f);
                                le3Var4.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                le3Var4.g(4.0f, 3.0f);
                                le3Var4.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                le3Var4.n(11.0f);
                                le3Var4.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var4.g(0.0f, 18.0f);
                                le3Var4.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var4.f(20.0f);
                                le3Var4.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                le3Var4.f(-4.0f);
                                le3Var4.b();
                                le3Var4.i(4.0f, 5.0f);
                                le3Var4.f(16.0f);
                                le3Var4.n(11.0f);
                                le3Var4.g(4.0f, 16.0f);
                                le3Var4.g(4.0f, 5.0f);
                                le3Var4.b();
                                le3Var4.i(12.0f, 19.0f);
                                le3Var4.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                le3Var4.k(0.45f, -1.0f, 1.0f, -1.0f);
                                le3Var4.k(1.0f, 0.45f, 1.0f, 1.0f);
                                le3Var4.k(-0.45f, 1.0f, -1.0f, 1.0f);
                                le3Var4.b();
                                qnHx7.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var4, null, "", le3Var4.a);
                                ej1VarD4 = qnHx7.d();
                                fXUx.x = ej1VarD4;
                            }
                            qu4.QnHx qnHx8 = qu4.a;
                            context4 = kd.w;
                            if (context4 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD4, iZUl.b(qu4.QnHx.b, context4, R.string.icon_mac_os_accessibility_description));
                            break;
                            break;
                        case 4:
                            ej1VarD5 = ac.c;
                            if (ej1VarD5 == null) {
                                ej1.QnHx qnHx9 = new ej1.QnHx("Outlined.PhoneIphone");
                                int i9 = sg5.a;
                                jq4 jq4Var5 = new jq4(yu.b);
                                le3 le3Var5 = new le3();
                                le3Var5.i(15.5f, 1.0f);
                                le3Var5.f(-8.0f);
                                le3Var5.c(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
                                le3Var5.n(17.0f);
                                le3Var5.c(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
                                le3Var5.f(8.0f);
                                le3Var5.d(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                                le3Var5.n(-17.0f);
                                le3Var5.c(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
                                le3Var5.b();
                                le3Var5.i(11.5f, 22.0f);
                                le3Var5.d(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                                le3Var5.k(0.67f, -1.5f, 1.5f, -1.5f);
                                le3Var5.k(1.5f, 0.67f, 1.5f, 1.5f);
                                le3Var5.k(-0.67f, 1.5f, -1.5f, 1.5f);
                                le3Var5.b();
                                le3Var5.i(16.0f, 18.0f);
                                le3Var5.g(7.0f, 18.0f);
                                le3Var5.g(7.0f, 4.0f);
                                le3Var5.f(9.0f);
                                le3Var5.n(14.0f);
                                le3Var5.b();
                                qnHx9.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var5, null, "", le3Var5.a);
                                ej1VarD5 = qnHx9.d();
                                ac.c = ej1VarD5;
                            }
                            qu4.QnHx qnHx10 = qu4.a;
                            context5 = kd.w;
                            if (context5 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD5, iZUl.b(qu4.QnHx.b, context5, R.string.icon_ios_accessibility_description));
                            break;
                            break;
                        case 5:
                            ej1VarD6 = FWT.x;
                            if (ej1VarD6 == null) {
                                ej1.QnHx qnHx11 = new ej1.QnHx("Outlined.PhoneAndroid");
                                int i10 = sg5.a;
                                jq4 jq4Var6 = new jq4(yu.b);
                                le3 le3Var6 = new le3();
                                le3Var6.i(16.0f, 1.0f);
                                le3Var6.g(8.0f, 1.0f);
                                le3Var6.c(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                                le3Var6.n(16.0f);
                                le3Var6.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                                le3Var6.f(8.0f);
                                le3Var6.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                                le3Var6.g(19.0f, 4.0f);
                                le3Var6.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                                le3Var6.b();
                                le3Var6.i(17.0f, 18.0f);
                                le3Var6.g(7.0f, 18.0f);
                                le3Var6.g(7.0f, 4.0f);
                                le3Var6.f(10.0f);
                                le3Var6.n(14.0f);
                                le3Var6.b();
                                le3Var6.i(14.0f, 21.0f);
                                le3Var6.f(-4.0f);
                                le3Var6.n(-1.0f);
                                le3Var6.f(4.0f);
                                le3Var6.n(1.0f);
                                le3Var6.b();
                                qnHx11.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var6, null, "", le3Var6.a);
                                ej1VarD6 = qnHx11.d();
                                FWT.x = ej1VarD6;
                            }
                            qu4.QnHx qnHx12 = qu4.a;
                            context6 = kd.w;
                            if (context6 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD6, iZUl.b(qu4.QnHx.b, context6, R.string.icon_android_accessibility_description));
                            break;
                            break;
                        case 6:
                            ej1VarD7 = iE.y;
                            if (ej1VarD7 == null) {
                                ej1.QnHx qnHx13 = new ej1.QnHx("Outlined.Tv");
                                int i11 = sg5.a;
                                jq4 jq4Var7 = new jq4(yu.b);
                                le3 le3Var7 = new le3();
                                le3Var7.i(21.0f, 3.0f);
                                le3Var7.g(3.0f, 3.0f);
                                le3Var7.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                le3Var7.n(12.0f);
                                le3Var7.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                le3Var7.f(5.0f);
                                le3Var7.n(2.0f);
                                le3Var7.f(8.0f);
                                le3Var7.n(-2.0f);
                                le3Var7.f(5.0f);
                                le3Var7.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                                le3Var7.g(23.0f, 5.0f);
                                le3Var7.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                le3Var7.b();
                                le3Var7.i(21.0f, 17.0f);
                                le3Var7.g(3.0f, 17.0f);
                                le3Var7.g(3.0f, 5.0f);
                                le3Var7.f(18.0f);
                                le3Var7.n(12.0f);
                                le3Var7.b();
                                qnHx13.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var7, null, "", le3Var7.a);
                                ej1VarD7 = qnHx13.d();
                                iE.y = ej1VarD7;
                            }
                            qu4.QnHx qnHx14 = qu4.a;
                            context7 = kd.w;
                            if (context7 == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            qh1Var = new qh1(ej1VarD7, iZUl.b(qu4.QnHx.b, context7, R.string.icon_android_tv_accessibility_description));
                            break;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    objB0 = qh1Var;
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                qh1 qh1Var2 = (qh1) objB0;
                j30VarQ.R(false);
                rh1.a(qh1Var2.a, qh1Var2.b, pg2Var3, 0L, j30VarQ, (i3 << 3) & 896, 8);
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(mv2Var, pg2Var3, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf2 = e40.a;
            j30VarQ.e(1095297563);
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(mv2Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                switch (mv2Var) {
                    case null:
                        ej1VarD = JUCk.a;
                        if (ej1VarD == null) {
                            ej1.QnHx qnHx15 = new ej1.QnHx("Outlined.DeviceUnknown");
                            int i12 = sg5.a;
                            jq4 jq4Var8 = new jq4(yu.b);
                            le3 le3Var8 = new le3();
                            le3Var8.i(17.0f, 1.0f);
                            le3Var8.g(7.0f, 1.0f);
                            le3Var8.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var8.n(18.0f);
                            le3Var8.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var8.f(10.0f);
                            le3Var8.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var8.g(19.0f, 3.0f);
                            le3Var8.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var8.b();
                            le3Var8.i(17.0f, 19.0f);
                            le3Var8.g(7.0f, 19.0f);
                            le3Var8.g(7.0f, 5.0f);
                            le3Var8.f(10.0f);
                            le3Var8.n(14.0f);
                            le3Var8.b();
                            le3Var8.i(12.0f, 6.72f);
                            le3Var8.d(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
                            le3Var8.f(1.75f);
                            le3Var8.d(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
                            le3Var8.k(1.75f, 0.82f, 1.75f, 1.75f);
                            le3Var8.d(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
                            le3Var8.f(1.76f);
                            le3Var8.d(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
                            le3Var8.d(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
                            le3Var8.b();
                            le3Var8.i(11.0f, 16.0f);
                            le3Var8.f(2.0f);
                            le3Var8.n(2.0f);
                            le3Var8.f(-2.0f);
                            le3Var8.n(-2.0f);
                            le3Var8.b();
                            qnHx15.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var8, null, "", le3Var8.a);
                            ej1VarD = qnHx15.d();
                            JUCk.a = ej1VarD;
                        }
                        qu4.QnHx qnHx16 = qu4.a;
                        context = kd.w;
                        if (context == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD, iZUl.b(qu4.QnHx.b, context, R.string.icon_unknown_accessibility_description));
                        break;
                        break;
                    case 1:
                        ej1VarD2 = ym.E;
                        if (ej1VarD2 == null) {
                            ej1.QnHx qnHx17 = new ej1.QnHx("Outlined.LaptopWindows");
                            int i13 = sg5.a;
                            jq4 jq4Var9 = new jq4(yu.b);
                            le3 le3Var9 = new le3();
                            le3Var9.i(20.0f, 18.0f);
                            le3Var9.n(-1.0f);
                            le3Var9.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var9.g(22.0f, 5.0f);
                            le3Var9.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var9.e(4.0f);
                            le3Var9.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var9.n(10.0f);
                            le3Var9.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var9.n(1.0f);
                            le3Var9.e(0.0f);
                            le3Var9.n(2.0f);
                            le3Var9.f(24.0f);
                            le3Var9.n(-2.0f);
                            le3Var9.f(-4.0f);
                            le3Var9.b();
                            le3Var9.i(4.0f, 5.0f);
                            le3Var9.f(16.0f);
                            le3Var9.n(10.0f);
                            le3Var9.e(4.0f);
                            le3Var9.m(5.0f);
                            le3Var9.b();
                            qnHx17.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var9, null, "", le3Var9.a);
                            ej1VarD2 = qnHx17.d();
                            ym.E = ej1VarD2;
                        }
                        qu4.QnHx qnHx18 = qu4.a;
                        context2 = kd.w;
                        if (context2 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD2, iZUl.b(qu4.QnHx.b, context2, R.string.icon_windows_accessibility_description));
                        break;
                        break;
                    case 2:
                        ej1VarD3 = ddf.w;
                        if (ej1VarD3 == null) {
                            ej1.QnHx qnHx19 = new ej1.QnHx("Outlined.Laptop");
                            int i14 = sg5.a;
                            jq4 jq4Var10 = new jq4(yu.b);
                            le3 le3Var10 = new le3();
                            le3Var10.i(20.0f, 18.0f);
                            le3Var10.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var10.m(6.0f);
                            le3Var10.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var10.e(4.0f);
                            le3Var10.c(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                            le3Var10.n(10.0f);
                            le3Var10.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var10.e(0.0f);
                            le3Var10.n(2.0f);
                            le3Var10.f(24.0f);
                            le3Var10.n(-2.0f);
                            le3Var10.e(20.0f);
                            le3Var10.b();
                            le3Var10.i(4.0f, 6.0f);
                            le3Var10.f(16.0f);
                            le3Var10.n(10.0f);
                            le3Var10.e(4.0f);
                            le3Var10.m(6.0f);
                            le3Var10.b();
                            qnHx19.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var10, null, "", le3Var10.a);
                            ej1VarD3 = qnHx19.d();
                            ddf.w = ej1VarD3;
                        }
                        qu4.QnHx qnHx20 = qu4.a;
                        context3 = kd.w;
                        if (context3 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD3, iZUl.b(qu4.QnHx.b, context3, R.string.icon_linux_accessibility_description));
                        break;
                        break;
                    case 3:
                        ej1VarD4 = fXUx.x;
                        if (ej1VarD4 == null) {
                            ej1.QnHx qnHx21 = new ej1.QnHx("Outlined.LaptopMac");
                            int i15 = sg5.a;
                            jq4 jq4Var11 = new jq4(yu.b);
                            le3 le3Var11 = new le3();
                            le3Var11.i(20.0f, 18.0f);
                            le3Var11.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var11.g(22.0f, 5.0f);
                            le3Var11.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var11.g(4.0f, 3.0f);
                            le3Var11.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var11.n(11.0f);
                            le3Var11.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var11.g(0.0f, 18.0f);
                            le3Var11.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var11.f(20.0f);
                            le3Var11.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var11.f(-4.0f);
                            le3Var11.b();
                            le3Var11.i(4.0f, 5.0f);
                            le3Var11.f(16.0f);
                            le3Var11.n(11.0f);
                            le3Var11.g(4.0f, 16.0f);
                            le3Var11.g(4.0f, 5.0f);
                            le3Var11.b();
                            le3Var11.i(12.0f, 19.0f);
                            le3Var11.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            le3Var11.k(0.45f, -1.0f, 1.0f, -1.0f);
                            le3Var11.k(1.0f, 0.45f, 1.0f, 1.0f);
                            le3Var11.k(-0.45f, 1.0f, -1.0f, 1.0f);
                            le3Var11.b();
                            qnHx21.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var11, null, "", le3Var11.a);
                            ej1VarD4 = qnHx21.d();
                            fXUx.x = ej1VarD4;
                        }
                        qu4.QnHx qnHx22 = qu4.a;
                        context4 = kd.w;
                        if (context4 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD4, iZUl.b(qu4.QnHx.b, context4, R.string.icon_mac_os_accessibility_description));
                        break;
                        break;
                    case 4:
                        ej1VarD5 = ac.c;
                        if (ej1VarD5 == null) {
                            ej1.QnHx qnHx23 = new ej1.QnHx("Outlined.PhoneIphone");
                            int i16 = sg5.a;
                            jq4 jq4Var12 = new jq4(yu.b);
                            le3 le3Var12 = new le3();
                            le3Var12.i(15.5f, 1.0f);
                            le3Var12.f(-8.0f);
                            le3Var12.c(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
                            le3Var12.n(17.0f);
                            le3Var12.c(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
                            le3Var12.f(8.0f);
                            le3Var12.d(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                            le3Var12.n(-17.0f);
                            le3Var12.c(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
                            le3Var12.b();
                            le3Var12.i(11.5f, 22.0f);
                            le3Var12.d(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                            le3Var12.k(0.67f, -1.5f, 1.5f, -1.5f);
                            le3Var12.k(1.5f, 0.67f, 1.5f, 1.5f);
                            le3Var12.k(-0.67f, 1.5f, -1.5f, 1.5f);
                            le3Var12.b();
                            le3Var12.i(16.0f, 18.0f);
                            le3Var12.g(7.0f, 18.0f);
                            le3Var12.g(7.0f, 4.0f);
                            le3Var12.f(9.0f);
                            le3Var12.n(14.0f);
                            le3Var12.b();
                            qnHx23.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var12, null, "", le3Var12.a);
                            ej1VarD5 = qnHx23.d();
                            ac.c = ej1VarD5;
                        }
                        qu4.QnHx qnHx110 = qu4.a;
                        context5 = kd.w;
                        if (context5 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD5, iZUl.b(qu4.QnHx.b, context5, R.string.icon_ios_accessibility_description));
                        break;
                        break;
                    case 5:
                        ej1VarD6 = FWT.x;
                        if (ej1VarD6 == null) {
                            ej1.QnHx qnHx111 = new ej1.QnHx("Outlined.PhoneAndroid");
                            int i17 = sg5.a;
                            jq4 jq4Var13 = new jq4(yu.b);
                            le3 le3Var13 = new le3();
                            le3Var13.i(16.0f, 1.0f);
                            le3Var13.g(8.0f, 1.0f);
                            le3Var13.c(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                            le3Var13.n(16.0f);
                            le3Var13.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            le3Var13.f(8.0f);
                            le3Var13.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                            le3Var13.g(19.0f, 4.0f);
                            le3Var13.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            le3Var13.b();
                            le3Var13.i(17.0f, 18.0f);
                            le3Var13.g(7.0f, 18.0f);
                            le3Var13.g(7.0f, 4.0f);
                            le3Var13.f(10.0f);
                            le3Var13.n(14.0f);
                            le3Var13.b();
                            le3Var13.i(14.0f, 21.0f);
                            le3Var13.f(-4.0f);
                            le3Var13.n(-1.0f);
                            le3Var13.f(4.0f);
                            le3Var13.n(1.0f);
                            le3Var13.b();
                            qnHx111.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var13, null, "", le3Var13.a);
                            ej1VarD6 = qnHx111.d();
                            FWT.x = ej1VarD6;
                        }
                        qu4.QnHx qnHx112 = qu4.a;
                        context6 = kd.w;
                        if (context6 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD6, iZUl.b(qu4.QnHx.b, context6, R.string.icon_android_accessibility_description));
                        break;
                        break;
                    case 6:
                        ej1VarD7 = iE.y;
                        if (ej1VarD7 == null) {
                            ej1.QnHx qnHx113 = new ej1.QnHx("Outlined.Tv");
                            int i18 = sg5.a;
                            jq4 jq4Var14 = new jq4(yu.b);
                            le3 le3Var14 = new le3();
                            le3Var14.i(21.0f, 3.0f);
                            le3Var14.g(3.0f, 3.0f);
                            le3Var14.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var14.n(12.0f);
                            le3Var14.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var14.f(5.0f);
                            le3Var14.n(2.0f);
                            le3Var14.f(8.0f);
                            le3Var14.n(-2.0f);
                            le3Var14.f(5.0f);
                            le3Var14.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var14.g(23.0f, 5.0f);
                            le3Var14.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var14.b();
                            le3Var14.i(21.0f, 17.0f);
                            le3Var14.g(3.0f, 17.0f);
                            le3Var14.g(3.0f, 5.0f);
                            le3Var14.f(18.0f);
                            le3Var14.n(12.0f);
                            le3Var14.b();
                            qnHx113.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var14, null, "", le3Var14.a);
                            ej1VarD7 = qnHx113.d();
                            iE.y = ej1VarD7;
                        }
                        qu4.QnHx qnHx114 = qu4.a;
                        context7 = kd.w;
                        if (context7 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD7, iZUl.b(qu4.QnHx.b, context7, R.string.icon_android_tv_accessibility_description));
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objB0 = qh1Var;
                j30VarQ.F0(objB0);
            } else {
                switch (mv2Var) {
                    case null:
                        ej1VarD = JUCk.a;
                        if (ej1VarD == null) {
                            ej1.QnHx qnHx115 = new ej1.QnHx("Outlined.DeviceUnknown");
                            int i19 = sg5.a;
                            jq4 jq4Var15 = new jq4(yu.b);
                            le3 le3Var15 = new le3();
                            le3Var15.i(17.0f, 1.0f);
                            le3Var15.g(7.0f, 1.0f);
                            le3Var15.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var15.n(18.0f);
                            le3Var15.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var15.f(10.0f);
                            le3Var15.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var15.g(19.0f, 3.0f);
                            le3Var15.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var15.b();
                            le3Var15.i(17.0f, 19.0f);
                            le3Var15.g(7.0f, 19.0f);
                            le3Var15.g(7.0f, 5.0f);
                            le3Var15.f(10.0f);
                            le3Var15.n(14.0f);
                            le3Var15.b();
                            le3Var15.i(12.0f, 6.72f);
                            le3Var15.d(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
                            le3Var15.f(1.75f);
                            le3Var15.d(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
                            le3Var15.k(1.75f, 0.82f, 1.75f, 1.75f);
                            le3Var15.d(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
                            le3Var15.f(1.76f);
                            le3Var15.d(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
                            le3Var15.d(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
                            le3Var15.b();
                            le3Var15.i(11.0f, 16.0f);
                            le3Var15.f(2.0f);
                            le3Var15.n(2.0f);
                            le3Var15.f(-2.0f);
                            le3Var15.n(-2.0f);
                            le3Var15.b();
                            qnHx115.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var15, null, "", le3Var15.a);
                            ej1VarD = qnHx115.d();
                            JUCk.a = ej1VarD;
                        }
                        qu4.QnHx qnHx116 = qu4.a;
                        context = kd.w;
                        if (context == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD, iZUl.b(qu4.QnHx.b, context, R.string.icon_unknown_accessibility_description));
                        break;
                        break;
                    case 1:
                        ej1VarD2 = ym.E;
                        if (ej1VarD2 == null) {
                            ej1.QnHx qnHx117 = new ej1.QnHx("Outlined.LaptopWindows");
                            int i110 = sg5.a;
                            jq4 jq4Var16 = new jq4(yu.b);
                            le3 le3Var16 = new le3();
                            le3Var16.i(20.0f, 18.0f);
                            le3Var16.n(-1.0f);
                            le3Var16.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var16.g(22.0f, 5.0f);
                            le3Var16.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var16.e(4.0f);
                            le3Var16.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var16.n(10.0f);
                            le3Var16.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var16.n(1.0f);
                            le3Var16.e(0.0f);
                            le3Var16.n(2.0f);
                            le3Var16.f(24.0f);
                            le3Var16.n(-2.0f);
                            le3Var16.f(-4.0f);
                            le3Var16.b();
                            le3Var16.i(4.0f, 5.0f);
                            le3Var16.f(16.0f);
                            le3Var16.n(10.0f);
                            le3Var16.e(4.0f);
                            le3Var16.m(5.0f);
                            le3Var16.b();
                            qnHx117.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var16, null, "", le3Var16.a);
                            ej1VarD2 = qnHx117.d();
                            ym.E = ej1VarD2;
                        }
                        qu4.QnHx qnHx118 = qu4.a;
                        context2 = kd.w;
                        if (context2 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD2, iZUl.b(qu4.QnHx.b, context2, R.string.icon_windows_accessibility_description));
                        break;
                        break;
                    case 2:
                        ej1VarD3 = ddf.w;
                        if (ej1VarD3 == null) {
                            ej1.QnHx qnHx119 = new ej1.QnHx("Outlined.Laptop");
                            int i111 = sg5.a;
                            jq4 jq4Var17 = new jq4(yu.b);
                            le3 le3Var17 = new le3();
                            le3Var17.i(20.0f, 18.0f);
                            le3Var17.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var17.m(6.0f);
                            le3Var17.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var17.e(4.0f);
                            le3Var17.c(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                            le3Var17.n(10.0f);
                            le3Var17.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var17.e(0.0f);
                            le3Var17.n(2.0f);
                            le3Var17.f(24.0f);
                            le3Var17.n(-2.0f);
                            le3Var17.e(20.0f);
                            le3Var17.b();
                            le3Var17.i(4.0f, 6.0f);
                            le3Var17.f(16.0f);
                            le3Var17.n(10.0f);
                            le3Var17.e(4.0f);
                            le3Var17.m(6.0f);
                            le3Var17.b();
                            qnHx119.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var17, null, "", le3Var17.a);
                            ej1VarD3 = qnHx119.d();
                            ddf.w = ej1VarD3;
                        }
                        qu4.QnHx qnHx24 = qu4.a;
                        context3 = kd.w;
                        if (context3 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD3, iZUl.b(qu4.QnHx.b, context3, R.string.icon_linux_accessibility_description));
                        break;
                        break;
                    case 3:
                        ej1VarD4 = fXUx.x;
                        if (ej1VarD4 == null) {
                            ej1.QnHx qnHx25 = new ej1.QnHx("Outlined.LaptopMac");
                            int i112 = sg5.a;
                            jq4 jq4Var18 = new jq4(yu.b);
                            le3 le3Var18 = new le3();
                            le3Var18.i(20.0f, 18.0f);
                            le3Var18.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var18.g(22.0f, 5.0f);
                            le3Var18.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var18.g(4.0f, 3.0f);
                            le3Var18.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var18.n(11.0f);
                            le3Var18.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var18.g(0.0f, 18.0f);
                            le3Var18.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var18.f(20.0f);
                            le3Var18.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var18.f(-4.0f);
                            le3Var18.b();
                            le3Var18.i(4.0f, 5.0f);
                            le3Var18.f(16.0f);
                            le3Var18.n(11.0f);
                            le3Var18.g(4.0f, 16.0f);
                            le3Var18.g(4.0f, 5.0f);
                            le3Var18.b();
                            le3Var18.i(12.0f, 19.0f);
                            le3Var18.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            le3Var18.k(0.45f, -1.0f, 1.0f, -1.0f);
                            le3Var18.k(1.0f, 0.45f, 1.0f, 1.0f);
                            le3Var18.k(-0.45f, 1.0f, -1.0f, 1.0f);
                            le3Var18.b();
                            qnHx25.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var18, null, "", le3Var18.a);
                            ej1VarD4 = qnHx25.d();
                            fXUx.x = ej1VarD4;
                        }
                        qu4.QnHx qnHx26 = qu4.a;
                        context4 = kd.w;
                        if (context4 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD4, iZUl.b(qu4.QnHx.b, context4, R.string.icon_mac_os_accessibility_description));
                        break;
                        break;
                    case 4:
                        ej1VarD5 = ac.c;
                        if (ej1VarD5 == null) {
                            ej1.QnHx qnHx27 = new ej1.QnHx("Outlined.PhoneIphone");
                            int i113 = sg5.a;
                            jq4 jq4Var19 = new jq4(yu.b);
                            le3 le3Var19 = new le3();
                            le3Var19.i(15.5f, 1.0f);
                            le3Var19.f(-8.0f);
                            le3Var19.c(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
                            le3Var19.n(17.0f);
                            le3Var19.c(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
                            le3Var19.f(8.0f);
                            le3Var19.d(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                            le3Var19.n(-17.0f);
                            le3Var19.c(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
                            le3Var19.b();
                            le3Var19.i(11.5f, 22.0f);
                            le3Var19.d(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                            le3Var19.k(0.67f, -1.5f, 1.5f, -1.5f);
                            le3Var19.k(1.5f, 0.67f, 1.5f, 1.5f);
                            le3Var19.k(-0.67f, 1.5f, -1.5f, 1.5f);
                            le3Var19.b();
                            le3Var19.i(16.0f, 18.0f);
                            le3Var19.g(7.0f, 18.0f);
                            le3Var19.g(7.0f, 4.0f);
                            le3Var19.f(9.0f);
                            le3Var19.n(14.0f);
                            le3Var19.b();
                            qnHx27.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var19, null, "", le3Var19.a);
                            ej1VarD5 = qnHx27.d();
                            ac.c = ej1VarD5;
                        }
                        qu4.QnHx qnHx1110 = qu4.a;
                        context5 = kd.w;
                        if (context5 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD5, iZUl.b(qu4.QnHx.b, context5, R.string.icon_ios_accessibility_description));
                        break;
                        break;
                    case 5:
                        ej1VarD6 = FWT.x;
                        if (ej1VarD6 == null) {
                            ej1.QnHx qnHx1111 = new ej1.QnHx("Outlined.PhoneAndroid");
                            int i114 = sg5.a;
                            jq4 jq4Var110 = new jq4(yu.b);
                            le3 le3Var110 = new le3();
                            le3Var110.i(16.0f, 1.0f);
                            le3Var110.g(8.0f, 1.0f);
                            le3Var110.c(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                            le3Var110.n(16.0f);
                            le3Var110.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            le3Var110.f(8.0f);
                            le3Var110.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                            le3Var110.g(19.0f, 4.0f);
                            le3Var110.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            le3Var110.b();
                            le3Var110.i(17.0f, 18.0f);
                            le3Var110.g(7.0f, 18.0f);
                            le3Var110.g(7.0f, 4.0f);
                            le3Var110.f(10.0f);
                            le3Var110.n(14.0f);
                            le3Var110.b();
                            le3Var110.i(14.0f, 21.0f);
                            le3Var110.f(-4.0f);
                            le3Var110.n(-1.0f);
                            le3Var110.f(4.0f);
                            le3Var110.n(1.0f);
                            le3Var110.b();
                            qnHx1111.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var110, null, "", le3Var110.a);
                            ej1VarD6 = qnHx1111.d();
                            FWT.x = ej1VarD6;
                        }
                        qu4.QnHx qnHx1112 = qu4.a;
                        context6 = kd.w;
                        if (context6 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD6, iZUl.b(qu4.QnHx.b, context6, R.string.icon_android_accessibility_description));
                        break;
                        break;
                    case 6:
                        ej1VarD7 = iE.y;
                        if (ej1VarD7 == null) {
                            ej1.QnHx qnHx1113 = new ej1.QnHx("Outlined.Tv");
                            int i115 = sg5.a;
                            jq4 jq4Var111 = new jq4(yu.b);
                            le3 le3Var111 = new le3();
                            le3Var111.i(21.0f, 3.0f);
                            le3Var111.g(3.0f, 3.0f);
                            le3Var111.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var111.n(12.0f);
                            le3Var111.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var111.f(5.0f);
                            le3Var111.n(2.0f);
                            le3Var111.f(8.0f);
                            le3Var111.n(-2.0f);
                            le3Var111.f(5.0f);
                            le3Var111.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var111.g(23.0f, 5.0f);
                            le3Var111.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var111.b();
                            le3Var111.i(21.0f, 17.0f);
                            le3Var111.g(3.0f, 17.0f);
                            le3Var111.g(3.0f, 5.0f);
                            le3Var111.f(18.0f);
                            le3Var111.n(12.0f);
                            le3Var111.b();
                            qnHx1113.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var111, null, "", le3Var111.a);
                            ej1VarD7 = qnHx1113.d();
                            iE.y = ej1VarD7;
                        }
                        qu4.QnHx qnHx1114 = qu4.a;
                        context7 = kd.w;
                        if (context7 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD7, iZUl.b(qu4.QnHx.b, context7, R.string.icon_android_tv_accessibility_description));
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objB0 = qh1Var;
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            qh1 qh1Var3 = (qh1) objB0;
            j30VarQ.R(false);
            rh1.a(qh1Var3.a, qh1Var3.b, pg2Var3, 0L, j30VarQ, (i3 << 3) & 896, 8);
        } else {
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf3 = e40.a;
            j30VarQ.e(1095297563);
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(mv2Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                switch (mv2Var) {
                    case null:
                        ej1VarD = JUCk.a;
                        if (ej1VarD == null) {
                            ej1.QnHx qnHx1115 = new ej1.QnHx("Outlined.DeviceUnknown");
                            int i116 = sg5.a;
                            jq4 jq4Var112 = new jq4(yu.b);
                            le3 le3Var112 = new le3();
                            le3Var112.i(17.0f, 1.0f);
                            le3Var112.g(7.0f, 1.0f);
                            le3Var112.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var112.n(18.0f);
                            le3Var112.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var112.f(10.0f);
                            le3Var112.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var112.g(19.0f, 3.0f);
                            le3Var112.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var112.b();
                            le3Var112.i(17.0f, 19.0f);
                            le3Var112.g(7.0f, 19.0f);
                            le3Var112.g(7.0f, 5.0f);
                            le3Var112.f(10.0f);
                            le3Var112.n(14.0f);
                            le3Var112.b();
                            le3Var112.i(12.0f, 6.72f);
                            le3Var112.d(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
                            le3Var112.f(1.75f);
                            le3Var112.d(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
                            le3Var112.k(1.75f, 0.82f, 1.75f, 1.75f);
                            le3Var112.d(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
                            le3Var112.f(1.76f);
                            le3Var112.d(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
                            le3Var112.d(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
                            le3Var112.b();
                            le3Var112.i(11.0f, 16.0f);
                            le3Var112.f(2.0f);
                            le3Var112.n(2.0f);
                            le3Var112.f(-2.0f);
                            le3Var112.n(-2.0f);
                            le3Var112.b();
                            qnHx1115.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var112, null, "", le3Var112.a);
                            ej1VarD = qnHx1115.d();
                            JUCk.a = ej1VarD;
                        }
                        qu4.QnHx qnHx1116 = qu4.a;
                        context = kd.w;
                        if (context == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD, iZUl.b(qu4.QnHx.b, context, R.string.icon_unknown_accessibility_description));
                        break;
                        break;
                    case 1:
                        ej1VarD2 = ym.E;
                        if (ej1VarD2 == null) {
                            ej1.QnHx qnHx1117 = new ej1.QnHx("Outlined.LaptopWindows");
                            int i117 = sg5.a;
                            jq4 jq4Var113 = new jq4(yu.b);
                            le3 le3Var113 = new le3();
                            le3Var113.i(20.0f, 18.0f);
                            le3Var113.n(-1.0f);
                            le3Var113.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var113.g(22.0f, 5.0f);
                            le3Var113.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var113.e(4.0f);
                            le3Var113.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var113.n(10.0f);
                            le3Var113.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var113.n(1.0f);
                            le3Var113.e(0.0f);
                            le3Var113.n(2.0f);
                            le3Var113.f(24.0f);
                            le3Var113.n(-2.0f);
                            le3Var113.f(-4.0f);
                            le3Var113.b();
                            le3Var113.i(4.0f, 5.0f);
                            le3Var113.f(16.0f);
                            le3Var113.n(10.0f);
                            le3Var113.e(4.0f);
                            le3Var113.m(5.0f);
                            le3Var113.b();
                            qnHx1117.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var113, null, "", le3Var113.a);
                            ej1VarD2 = qnHx1117.d();
                            ym.E = ej1VarD2;
                        }
                        qu4.QnHx qnHx1118 = qu4.a;
                        context2 = kd.w;
                        if (context2 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD2, iZUl.b(qu4.QnHx.b, context2, R.string.icon_windows_accessibility_description));
                        break;
                        break;
                    case 2:
                        ej1VarD3 = ddf.w;
                        if (ej1VarD3 == null) {
                            ej1.QnHx qnHx1119 = new ej1.QnHx("Outlined.Laptop");
                            int i118 = sg5.a;
                            jq4 jq4Var114 = new jq4(yu.b);
                            le3 le3Var114 = new le3();
                            le3Var114.i(20.0f, 18.0f);
                            le3Var114.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var114.m(6.0f);
                            le3Var114.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var114.e(4.0f);
                            le3Var114.c(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                            le3Var114.n(10.0f);
                            le3Var114.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var114.e(0.0f);
                            le3Var114.n(2.0f);
                            le3Var114.f(24.0f);
                            le3Var114.n(-2.0f);
                            le3Var114.e(20.0f);
                            le3Var114.b();
                            le3Var114.i(4.0f, 6.0f);
                            le3Var114.f(16.0f);
                            le3Var114.n(10.0f);
                            le3Var114.e(4.0f);
                            le3Var114.m(6.0f);
                            le3Var114.b();
                            qnHx1119.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var114, null, "", le3Var114.a);
                            ej1VarD3 = qnHx1119.d();
                            ddf.w = ej1VarD3;
                        }
                        qu4.QnHx qnHx28 = qu4.a;
                        context3 = kd.w;
                        if (context3 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD3, iZUl.b(qu4.QnHx.b, context3, R.string.icon_linux_accessibility_description));
                        break;
                        break;
                    case 3:
                        ej1VarD4 = fXUx.x;
                        if (ej1VarD4 == null) {
                            ej1.QnHx qnHx29 = new ej1.QnHx("Outlined.LaptopMac");
                            int i119 = sg5.a;
                            jq4 jq4Var115 = new jq4(yu.b);
                            le3 le3Var115 = new le3();
                            le3Var115.i(20.0f, 18.0f);
                            le3Var115.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var115.g(22.0f, 5.0f);
                            le3Var115.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var115.g(4.0f, 3.0f);
                            le3Var115.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var115.n(11.0f);
                            le3Var115.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var115.g(0.0f, 18.0f);
                            le3Var115.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var115.f(20.0f);
                            le3Var115.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var115.f(-4.0f);
                            le3Var115.b();
                            le3Var115.i(4.0f, 5.0f);
                            le3Var115.f(16.0f);
                            le3Var115.n(11.0f);
                            le3Var115.g(4.0f, 16.0f);
                            le3Var115.g(4.0f, 5.0f);
                            le3Var115.b();
                            le3Var115.i(12.0f, 19.0f);
                            le3Var115.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            le3Var115.k(0.45f, -1.0f, 1.0f, -1.0f);
                            le3Var115.k(1.0f, 0.45f, 1.0f, 1.0f);
                            le3Var115.k(-0.45f, 1.0f, -1.0f, 1.0f);
                            le3Var115.b();
                            qnHx29.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var115, null, "", le3Var115.a);
                            ej1VarD4 = qnHx29.d();
                            fXUx.x = ej1VarD4;
                        }
                        qu4.QnHx qnHx210 = qu4.a;
                        context4 = kd.w;
                        if (context4 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD4, iZUl.b(qu4.QnHx.b, context4, R.string.icon_mac_os_accessibility_description));
                        break;
                        break;
                    case 4:
                        ej1VarD5 = ac.c;
                        if (ej1VarD5 == null) {
                            ej1.QnHx qnHx211 = new ej1.QnHx("Outlined.PhoneIphone");
                            int i1110 = sg5.a;
                            jq4 jq4Var116 = new jq4(yu.b);
                            le3 le3Var116 = new le3();
                            le3Var116.i(15.5f, 1.0f);
                            le3Var116.f(-8.0f);
                            le3Var116.c(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
                            le3Var116.n(17.0f);
                            le3Var116.c(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
                            le3Var116.f(8.0f);
                            le3Var116.d(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                            le3Var116.n(-17.0f);
                            le3Var116.c(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
                            le3Var116.b();
                            le3Var116.i(11.5f, 22.0f);
                            le3Var116.d(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                            le3Var116.k(0.67f, -1.5f, 1.5f, -1.5f);
                            le3Var116.k(1.5f, 0.67f, 1.5f, 1.5f);
                            le3Var116.k(-0.67f, 1.5f, -1.5f, 1.5f);
                            le3Var116.b();
                            le3Var116.i(16.0f, 18.0f);
                            le3Var116.g(7.0f, 18.0f);
                            le3Var116.g(7.0f, 4.0f);
                            le3Var116.f(9.0f);
                            le3Var116.n(14.0f);
                            le3Var116.b();
                            qnHx211.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var116, null, "", le3Var116.a);
                            ej1VarD5 = qnHx211.d();
                            ac.c = ej1VarD5;
                        }
                        qu4.QnHx qnHx11110 = qu4.a;
                        context5 = kd.w;
                        if (context5 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD5, iZUl.b(qu4.QnHx.b, context5, R.string.icon_ios_accessibility_description));
                        break;
                        break;
                    case 5:
                        ej1VarD6 = FWT.x;
                        if (ej1VarD6 == null) {
                            ej1.QnHx qnHx11111 = new ej1.QnHx("Outlined.PhoneAndroid");
                            int i1111 = sg5.a;
                            jq4 jq4Var117 = new jq4(yu.b);
                            le3 le3Var117 = new le3();
                            le3Var117.i(16.0f, 1.0f);
                            le3Var117.g(8.0f, 1.0f);
                            le3Var117.c(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                            le3Var117.n(16.0f);
                            le3Var117.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            le3Var117.f(8.0f);
                            le3Var117.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                            le3Var117.g(19.0f, 4.0f);
                            le3Var117.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            le3Var117.b();
                            le3Var117.i(17.0f, 18.0f);
                            le3Var117.g(7.0f, 18.0f);
                            le3Var117.g(7.0f, 4.0f);
                            le3Var117.f(10.0f);
                            le3Var117.n(14.0f);
                            le3Var117.b();
                            le3Var117.i(14.0f, 21.0f);
                            le3Var117.f(-4.0f);
                            le3Var117.n(-1.0f);
                            le3Var117.f(4.0f);
                            le3Var117.n(1.0f);
                            le3Var117.b();
                            qnHx11111.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var117, null, "", le3Var117.a);
                            ej1VarD6 = qnHx11111.d();
                            FWT.x = ej1VarD6;
                        }
                        qu4.QnHx qnHx11112 = qu4.a;
                        context6 = kd.w;
                        if (context6 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD6, iZUl.b(qu4.QnHx.b, context6, R.string.icon_android_accessibility_description));
                        break;
                        break;
                    case 6:
                        ej1VarD7 = iE.y;
                        if (ej1VarD7 == null) {
                            ej1.QnHx qnHx11113 = new ej1.QnHx("Outlined.Tv");
                            int i1112 = sg5.a;
                            jq4 jq4Var118 = new jq4(yu.b);
                            le3 le3Var118 = new le3();
                            le3Var118.i(21.0f, 3.0f);
                            le3Var118.g(3.0f, 3.0f);
                            le3Var118.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var118.n(12.0f);
                            le3Var118.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var118.f(5.0f);
                            le3Var118.n(2.0f);
                            le3Var118.f(8.0f);
                            le3Var118.n(-2.0f);
                            le3Var118.f(5.0f);
                            le3Var118.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var118.g(23.0f, 5.0f);
                            le3Var118.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var118.b();
                            le3Var118.i(21.0f, 17.0f);
                            le3Var118.g(3.0f, 17.0f);
                            le3Var118.g(3.0f, 5.0f);
                            le3Var118.f(18.0f);
                            le3Var118.n(12.0f);
                            le3Var118.b();
                            qnHx11113.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var118, null, "", le3Var118.a);
                            ej1VarD7 = qnHx11113.d();
                            iE.y = ej1VarD7;
                        }
                        qu4.QnHx qnHx11114 = qu4.a;
                        context7 = kd.w;
                        if (context7 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD7, iZUl.b(qu4.QnHx.b, context7, R.string.icon_android_tv_accessibility_description));
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objB0 = qh1Var;
                j30VarQ.F0(objB0);
            } else {
                switch (mv2Var) {
                    case UNKNOWN:
                        ej1VarD = JUCk.a;
                        if (ej1VarD == null) {
                            ej1.QnHx qnHx11115 = new ej1.QnHx("Outlined.DeviceUnknown");
                            int i1113 = sg5.a;
                            jq4 jq4Var119 = new jq4(yu.b);
                            le3 le3Var119 = new le3();
                            le3Var119.i(17.0f, 1.0f);
                            le3Var119.g(7.0f, 1.0f);
                            le3Var119.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var119.n(18.0f);
                            le3Var119.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var119.f(10.0f);
                            le3Var119.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var119.g(19.0f, 3.0f);
                            le3Var119.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var119.b();
                            le3Var119.i(17.0f, 19.0f);
                            le3Var119.g(7.0f, 19.0f);
                            le3Var119.g(7.0f, 5.0f);
                            le3Var119.f(10.0f);
                            le3Var119.n(14.0f);
                            le3Var119.b();
                            le3Var119.i(12.0f, 6.72f);
                            le3Var119.d(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
                            le3Var119.f(1.75f);
                            le3Var119.d(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
                            le3Var119.k(1.75f, 0.82f, 1.75f, 1.75f);
                            le3Var119.d(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
                            le3Var119.f(1.76f);
                            le3Var119.d(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
                            le3Var119.d(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
                            le3Var119.b();
                            le3Var119.i(11.0f, 16.0f);
                            le3Var119.f(2.0f);
                            le3Var119.n(2.0f);
                            le3Var119.f(-2.0f);
                            le3Var119.n(-2.0f);
                            le3Var119.b();
                            qnHx11115.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var119, null, "", le3Var119.a);
                            ej1VarD = qnHx11115.d();
                            JUCk.a = ej1VarD;
                        }
                        qu4.QnHx qnHx11116 = qu4.a;
                        context = kd.w;
                        if (context == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD, iZUl.b(qu4.QnHx.b, context, R.string.icon_unknown_accessibility_description));
                        break;
                        break;
                    case WINDOWS:
                        ej1VarD2 = ym.E;
                        if (ej1VarD2 == null) {
                            ej1.QnHx qnHx11117 = new ej1.QnHx("Outlined.LaptopWindows");
                            int i1114 = sg5.a;
                            jq4 jq4Var1110 = new jq4(yu.b);
                            le3 le3Var1110 = new le3();
                            le3Var1110.i(20.0f, 18.0f);
                            le3Var1110.n(-1.0f);
                            le3Var1110.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var1110.g(22.0f, 5.0f);
                            le3Var1110.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var1110.e(4.0f);
                            le3Var1110.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var1110.n(10.0f);
                            le3Var1110.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var1110.n(1.0f);
                            le3Var1110.e(0.0f);
                            le3Var1110.n(2.0f);
                            le3Var1110.f(24.0f);
                            le3Var1110.n(-2.0f);
                            le3Var1110.f(-4.0f);
                            le3Var1110.b();
                            le3Var1110.i(4.0f, 5.0f);
                            le3Var1110.f(16.0f);
                            le3Var1110.n(10.0f);
                            le3Var1110.e(4.0f);
                            le3Var1110.m(5.0f);
                            le3Var1110.b();
                            qnHx11117.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1110, null, "", le3Var1110.a);
                            ej1VarD2 = qnHx11117.d();
                            ym.E = ej1VarD2;
                        }
                        qu4.QnHx qnHx11118 = qu4.a;
                        context2 = kd.w;
                        if (context2 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD2, iZUl.b(qu4.QnHx.b, context2, R.string.icon_windows_accessibility_description));
                        break;
                        break;
                    case LINUX:
                        ej1VarD3 = ddf.w;
                        if (ej1VarD3 == null) {
                            ej1.QnHx qnHx11119 = new ej1.QnHx("Outlined.Laptop");
                            int i1115 = sg5.a;
                            jq4 jq4Var1111 = new jq4(yu.b);
                            le3 le3Var1111 = new le3();
                            le3Var1111.i(20.0f, 18.0f);
                            le3Var1111.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var1111.m(6.0f);
                            le3Var1111.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var1111.e(4.0f);
                            le3Var1111.c(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                            le3Var1111.n(10.0f);
                            le3Var1111.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var1111.e(0.0f);
                            le3Var1111.n(2.0f);
                            le3Var1111.f(24.0f);
                            le3Var1111.n(-2.0f);
                            le3Var1111.e(20.0f);
                            le3Var1111.b();
                            le3Var1111.i(4.0f, 6.0f);
                            le3Var1111.f(16.0f);
                            le3Var1111.n(10.0f);
                            le3Var1111.e(4.0f);
                            le3Var1111.m(6.0f);
                            le3Var1111.b();
                            qnHx11119.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1111, null, "", le3Var1111.a);
                            ej1VarD3 = qnHx11119.d();
                            ddf.w = ej1VarD3;
                        }
                        qu4.QnHx qnHx212 = qu4.a;
                        context3 = kd.w;
                        if (context3 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD3, iZUl.b(qu4.QnHx.b, context3, R.string.icon_linux_accessibility_description));
                        break;
                        break;
                    case MAC_OS:
                        ej1VarD4 = fXUx.x;
                        if (ej1VarD4 == null) {
                            ej1.QnHx qnHx213 = new ej1.QnHx("Outlined.LaptopMac");
                            int i1116 = sg5.a;
                            jq4 jq4Var1112 = new jq4(yu.b);
                            le3 le3Var1112 = new le3();
                            le3Var1112.i(20.0f, 18.0f);
                            le3Var1112.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var1112.g(22.0f, 5.0f);
                            le3Var1112.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var1112.g(4.0f, 3.0f);
                            le3Var1112.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var1112.n(11.0f);
                            le3Var1112.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var1112.g(0.0f, 18.0f);
                            le3Var1112.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var1112.f(20.0f);
                            le3Var1112.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            le3Var1112.f(-4.0f);
                            le3Var1112.b();
                            le3Var1112.i(4.0f, 5.0f);
                            le3Var1112.f(16.0f);
                            le3Var1112.n(11.0f);
                            le3Var1112.g(4.0f, 16.0f);
                            le3Var1112.g(4.0f, 5.0f);
                            le3Var1112.b();
                            le3Var1112.i(12.0f, 19.0f);
                            le3Var1112.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            le3Var1112.k(0.45f, -1.0f, 1.0f, -1.0f);
                            le3Var1112.k(1.0f, 0.45f, 1.0f, 1.0f);
                            le3Var1112.k(-0.45f, 1.0f, -1.0f, 1.0f);
                            le3Var1112.b();
                            qnHx213.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1112, null, "", le3Var1112.a);
                            ej1VarD4 = qnHx213.d();
                            fXUx.x = ej1VarD4;
                        }
                        qu4.QnHx qnHx214 = qu4.a;
                        context4 = kd.w;
                        if (context4 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD4, iZUl.b(qu4.QnHx.b, context4, R.string.icon_mac_os_accessibility_description));
                        break;
                        break;
                    case IOS:
                        ej1VarD5 = ac.c;
                        if (ej1VarD5 == null) {
                            ej1.QnHx qnHx215 = new ej1.QnHx("Outlined.PhoneIphone");
                            int i1117 = sg5.a;
                            jq4 jq4Var1113 = new jq4(yu.b);
                            le3 le3Var1113 = new le3();
                            le3Var1113.i(15.5f, 1.0f);
                            le3Var1113.f(-8.0f);
                            le3Var1113.c(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
                            le3Var1113.n(17.0f);
                            le3Var1113.c(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
                            le3Var1113.f(8.0f);
                            le3Var1113.d(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
                            le3Var1113.n(-17.0f);
                            le3Var1113.c(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
                            le3Var1113.b();
                            le3Var1113.i(11.5f, 22.0f);
                            le3Var1113.d(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                            le3Var1113.k(0.67f, -1.5f, 1.5f, -1.5f);
                            le3Var1113.k(1.5f, 0.67f, 1.5f, 1.5f);
                            le3Var1113.k(-0.67f, 1.5f, -1.5f, 1.5f);
                            le3Var1113.b();
                            le3Var1113.i(16.0f, 18.0f);
                            le3Var1113.g(7.0f, 18.0f);
                            le3Var1113.g(7.0f, 4.0f);
                            le3Var1113.f(9.0f);
                            le3Var1113.n(14.0f);
                            le3Var1113.b();
                            qnHx215.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1113, null, "", le3Var1113.a);
                            ej1VarD5 = qnHx215.d();
                            ac.c = ej1VarD5;
                        }
                        qu4.QnHx qnHx111110 = qu4.a;
                        context5 = kd.w;
                        if (context5 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD5, iZUl.b(qu4.QnHx.b, context5, R.string.icon_ios_accessibility_description));
                        break;
                        break;
                    case ANDROID:
                        ej1VarD6 = FWT.x;
                        if (ej1VarD6 == null) {
                            ej1.QnHx qnHx111111 = new ej1.QnHx("Outlined.PhoneAndroid");
                            int i1118 = sg5.a;
                            jq4 jq4Var1114 = new jq4(yu.b);
                            le3 le3Var1114 = new le3();
                            le3Var1114.i(16.0f, 1.0f);
                            le3Var1114.g(8.0f, 1.0f);
                            le3Var1114.c(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                            le3Var1114.n(16.0f);
                            le3Var1114.d(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            le3Var1114.f(8.0f);
                            le3Var1114.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                            le3Var1114.g(19.0f, 4.0f);
                            le3Var1114.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            le3Var1114.b();
                            le3Var1114.i(17.0f, 18.0f);
                            le3Var1114.g(7.0f, 18.0f);
                            le3Var1114.g(7.0f, 4.0f);
                            le3Var1114.f(10.0f);
                            le3Var1114.n(14.0f);
                            le3Var1114.b();
                            le3Var1114.i(14.0f, 21.0f);
                            le3Var1114.f(-4.0f);
                            le3Var1114.n(-1.0f);
                            le3Var1114.f(4.0f);
                            le3Var1114.n(1.0f);
                            le3Var1114.b();
                            qnHx111111.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1114, null, "", le3Var1114.a);
                            ej1VarD6 = qnHx111111.d();
                            FWT.x = ej1VarD6;
                        }
                        qu4.QnHx qnHx111112 = qu4.a;
                        context6 = kd.w;
                        if (context6 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD6, iZUl.b(qu4.QnHx.b, context6, R.string.icon_android_accessibility_description));
                        break;
                        break;
                    case ANDROID_TV:
                        ej1VarD7 = iE.y;
                        if (ej1VarD7 == null) {
                            ej1.QnHx qnHx111113 = new ej1.QnHx("Outlined.Tv");
                            int i1119 = sg5.a;
                            jq4 jq4Var1115 = new jq4(yu.b);
                            le3 le3Var1115 = new le3();
                            le3Var1115.i(21.0f, 3.0f);
                            le3Var1115.g(3.0f, 3.0f);
                            le3Var1115.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            le3Var1115.n(12.0f);
                            le3Var1115.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            le3Var1115.f(5.0f);
                            le3Var1115.n(2.0f);
                            le3Var1115.f(8.0f);
                            le3Var1115.n(-2.0f);
                            le3Var1115.f(5.0f);
                            le3Var1115.d(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            le3Var1115.g(23.0f, 5.0f);
                            le3Var1115.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            le3Var1115.b();
                            le3Var1115.i(21.0f, 17.0f);
                            le3Var1115.g(3.0f, 17.0f);
                            le3Var1115.g(3.0f, 5.0f);
                            le3Var1115.f(18.0f);
                            le3Var1115.n(12.0f);
                            le3Var1115.b();
                            qnHx111113.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var1115, null, "", le3Var1115.a);
                            ej1VarD7 = qnHx111113.d();
                            iE.y = ej1VarD7;
                        }
                        qu4.QnHx qnHx111114 = qu4.a;
                        context7 = kd.w;
                        if (context7 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        qh1Var = new qh1(ej1VarD7, iZUl.b(qu4.QnHx.b, context7, R.string.icon_android_tv_accessibility_description));
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objB0 = qh1Var;
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            qh1 qh1Var4 = (qh1) objB0;
            j30VarQ.R(false);
            rh1.a(qh1Var4.a, qh1Var4.b, pg2Var3, 0L, j30VarQ, (i3 << 3) & 896, 8);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(mv2Var, pg2Var3, i, i2);
    }
}
