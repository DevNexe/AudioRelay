package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ci4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ Boolean x;
        public final /* synthetic */ j81<tg4, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, Boolean bool, String str, j81 j81Var) {
            super(2);
            this.w = str;
            this.x = bool;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            Boolean bool = this.x;
            j81<tg4, sd5> j81Var = this.y;
            ci4.a(this.w, bool, j81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements j81<tg4, sd5> {
        public final /* synthetic */ ri4 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(ri4 ri4Var) {
            super(1);
            this.w = ri4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(tg4 tg4Var) {
            this.w.g(tg4Var);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, j81 j81Var) {
            super(3);
            this.w = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.i(R.string.pref_device_category, g30Var2, 0);
                String strX = hH.x(R.string.settings_display_device_name_title, g30Var2);
                String strX2 = hH.x(R.string.settings_display_device_name_description, g30Var2);
                sz szVar = g20.i;
                g30Var2.e(1157296644);
                j81<tg4, sd5> j81Var = this.w;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new di4(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.b(null, strX, strX2, szVar, null, (h81) objF, g30Var2, 3072, 17);
            }
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FJCM(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ci4.e(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class LPt6Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Boolean w;
        public final /* synthetic */ j81<tg4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt6Fixed(int i, Boolean bool, j81 j81Var) {
            super(2);
            this.w = bool;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ci4.g(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, j81 j81Var) {
            super(2);
            this.w = j81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ci4.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class MZ extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ Boolean y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MZ(int i, Boolean bool, j81 j81Var) {
            super(3);
            this.w = j81Var;
            this.x = i;
            this.y = bool;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.i(R.string.pref_setup_category, g30Var2, 0);
                String strX = hH.x(R.string.pref_setup_server_title, g30Var2);
                String strX2 = hH.x(R.string.pref_setup_server_summary, g30Var2);
                sz szVar = g20.a;
                g30Var2.e(1157296644);
                j81<tg4, sd5> j81Var = this.w;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new ji4(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.b(null, strX, strX2, szVar, null, (h81) objF, g30Var2, 3072, 17);
                String strX3 = hH.x(R.string.drawer_faq, g30Var2);
                sz szVar2 = g20.b;
                sz szVar3 = g20.c;
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(j81Var);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new ki4(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                q55.b(null, strX3, "https://docs.audiorelay.net/faq", szVar2, szVar3, (h81) objF2, g30Var2, 28032, 1);
                String strX4 = hH.x(R.string.drawer_forum, g30Var2);
                sz szVar4 = g20.d;
                sz szVar5 = g20.e;
                g30Var2.e(1157296644);
                boolean zI3 = g30Var2.I(j81Var);
                Object objF3 = g30Var2.f();
                if (zI3 || objF3 == c0132QnHx) {
                    objF3 = new li4(j81Var);
                    g30Var2.B(objF3);
                }
                g30Var2.G();
                q55.b(null, strX4, "https://community.audiorelay.net", szVar4, szVar5, (h81) objF3, g30Var2, 28032, 1);
                String strX5 = hH.x(R.string.drawer_contact_us, g30Var2);
                sz szVar6 = g20.f;
                sz szVar7 = g20.g;
                g30Var2.e(1157296644);
                boolean zI4 = g30Var2.I(j81Var);
                Object objF4 = g30Var2.f();
                if (zI4 || objF4 == c0132QnHx) {
                    objF4 = new mi4(j81Var);
                    g30Var2.B(objF4);
                }
                g30Var2.G();
                q55.b(null, strX5, "support@audiorelay.net", szVar6, szVar7, (h81) objF4, g30Var2, 28032, 1);
                String strX6 = hH.x(R.string.pref_setup_usb_tethering_title, g30Var2);
                String strX7 = hH.x(R.string.pref_setup_usb_tethering_summary, g30Var2);
                sz szVar8 = g20.h;
                Boolean bool = this.y;
                g30Var2.e(1157296644);
                boolean zI5 = g30Var2.I(j81Var);
                Object objF5 = g30Var2.f();
                if (zI5 || objF5 == c0132QnHx) {
                    objF5 = new ni4(j81Var);
                    g30Var2.B(objF5);
                }
                g30Var2.G();
                oy4.a(strX6, null, szVar8, bool, strX7, null, false, false, null, (j81) objF5, g30Var2, ((this.x << 9) & 7168) | 384, 482);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, j81 j81Var) {
            super(3);
            this.w = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.i(R.string.settings_display_title, g30Var2, 0);
                String strX = hH.x(R.string.pref_display_theme_title, g30Var2);
                String strX2 = hH.x(R.string.pref_display_theme_summary, g30Var2);
                sz szVar = g20.j;
                g30Var2.e(1157296644);
                j81<tg4, sd5> j81Var = this.w;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new ei4(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.b(null, strX, strX2, szVar, null, (h81) objF, g30Var2, 3072, 17);
                String strX3 = hH.x(R.string.settings_display_language_title, g30Var2);
                String strX4 = hH.x(R.string.settings_display_language_description, g30Var2);
                sz szVar2 = g20.k;
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(j81Var);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new fi4(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                q55.b(null, strX3, strX4, szVar2, null, (h81) objF2, g30Var2, 3072, 17);
            }
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PRnFixed(j81<? super tg4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(tg4.CQf.a);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ Boolean y;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, Boolean bool, String str, j81 j81Var) {
            super(3);
            this.w = j81Var;
            this.x = i;
            this.y = bool;
            this.z = str;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0184  */
        /* JADX WARN: Code duplicated, block: B:38:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:41:0x01d7  */
        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30.QnHx.C0132QnHx c0132QnHx;
            boolean zI;
            Object objF;
            boolean zI2;
            Object objF2;
            String str;
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.i(R.string.settings_about_title, g30Var2, 0);
                String strX = hH.x(R.string.drawer_share_app, g30Var2);
                String strX2 = hH.x(R.string.share_app_description, g30Var2);
                sz szVar = g20.l;
                g30Var2.e(1157296644);
                j81<tg4, sd5> j81Var = this.w;
                boolean zI3 = g30Var2.I(j81Var);
                Object objF3 = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx2 = g30.QnHx.a;
                if (zI3 || objF3 == c0132QnHx2) {
                    objF3 = new vh4(j81Var);
                    g30Var2.B(objF3);
                }
                g30Var2.G();
                q55.b(null, strX, strX2, szVar, null, (h81) objF3, g30Var2, 3072, 17);
                String strX3 = hH.x(R.string.drawer_play_store, g30Var2);
                String strX4 = hH.x(R.string.drawer_send_feedback, g30Var2);
                sz szVar2 = g20.m;
                sz szVar3 = g20.n;
                g30Var2.e(1157296644);
                boolean zI4 = g30Var2.I(j81Var);
                Object objF4 = g30Var2.f();
                if (zI4 || objF4 == c0132QnHx2) {
                    objF4 = new wh4(j81Var);
                    g30Var2.B(objF4);
                }
                g30Var2.G();
                q55.b(null, strX3, strX4, szVar2, szVar3, (h81) objF4, g30Var2, 27648, 1);
                String strX5 = hH.x(R.string.settings_translations_title, g30Var2);
                String strX6 = hH.x(R.string.settings_translations_description, g30Var2);
                sz szVar4 = g20.o;
                sz szVar5 = g20.p;
                g30Var2.e(1157296644);
                boolean zI5 = g30Var2.I(j81Var);
                Object objF5 = g30Var2.f();
                if (zI5 || objF5 == c0132QnHx2) {
                    objF5 = new xh4(j81Var);
                    g30Var2.B(objF5);
                }
                g30Var2.G();
                q55.b(null, strX5, strX6, szVar4, szVar5, (h81) objF5, g30Var2, 27648, 1);
                String strX7 = hH.x(R.string.pref_analytics_title, g30Var2);
                String strX8 = hH.x(R.string.pref_analytics_summary, g30Var2);
                sz szVar6 = g20.q;
                Boolean bool = this.y;
                g30Var2.e(1157296644);
                boolean zI6 = g30Var2.I(j81Var);
                Object objF6 = g30Var2.f();
                if (zI6 || objF6 == c0132QnHx2) {
                    objF6 = new yh4(j81Var);
                    g30Var2.B(objF6);
                }
                g30Var2.G();
                oy4.a(strX7, null, szVar6, bool, strX8, null, false, false, null, (j81) objF6, g30Var2, ((this.x << 6) & 7168) | 384, 482);
                String strX9 = hH.x(R.string.settings_translators_title, g30Var2);
                String strX10 = hH.x(R.string.settings_translators_description, g30Var2);
                sz szVar7 = g20.r;
                g30Var2.e(1157296644);
                boolean zI7 = g30Var2.I(j81Var);
                Object objF7 = g30Var2.f();
                if (zI7) {
                    c0132QnHx = c0132QnHx2;
                } else {
                    c0132QnHx = c0132QnHx2;
                    if (objF7 == c0132QnHx) {
                    }
                    g30Var2.G();
                    q55.b(null, strX9, strX10, szVar7, null, (h81) objF7, g30Var2, 3072, 17);
                    String strX11 = hH.x(R.string.pref_open_source_licenses_title, g30Var2);
                    String strX12 = hH.x(R.string.settings_open_source_licenses_description, g30Var2);
                    sz szVar8 = g20.s;
                    g30Var2.e(1157296644);
                    zI = g30Var2.I(j81Var);
                    objF = g30Var2.f();
                    if (zI || objF == c0132QnHx) {
                        objF = new ai4(j81Var);
                        g30Var2.B(objF);
                    }
                    g30Var2.G();
                    q55.b(null, strX11, strX12, szVar8, null, (h81) objF, g30Var2, 3072, 17);
                    String strX13 = hH.x(R.string.settings_privacy_policy_title, g30Var2);
                    sz szVar9 = g20.t;
                    sz szVar10 = g20.u;
                    g30Var2.e(1157296644);
                    zI2 = g30Var2.I(j81Var);
                    objF2 = g30Var2.f();
                    if (zI2 || objF2 == c0132QnHx) {
                        objF2 = new bi4(j81Var);
                        g30Var2.B(objF2);
                    }
                    g30Var2.G();
                    q55.b(null, strX13, null, szVar9, szVar10, (h81) objF2, g30Var2, 27648, 5);
                    String strX14 = hH.x(R.string.settings_about_version_title, g30Var2);
                    str = this.z;
                    if (str == null) {
                        str = "";
                    }
                    q55.b(null, strX14, str, g20.v, null, null, g30Var2, 3072, 49);
                }
                objF7 = new zh4(j81Var);
                g30Var2.B(objF7);
                g30Var2.G();
                q55.b(null, strX9, strX10, szVar7, null, (h81) objF7, g30Var2, 3072, 17);
                String strX15 = hH.x(R.string.pref_open_source_licenses_title, g30Var2);
                String strX16 = hH.x(R.string.settings_open_source_licenses_description, g30Var2);
                sz szVar11 = g20.s;
                g30Var2.e(1157296644);
                zI = g30Var2.I(j81Var);
                objF = g30Var2.f();
                if (zI) {
                    objF = new ai4(j81Var);
                    g30Var2.B(objF);
                } else {
                    objF = new ai4(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.b(null, strX15, strX16, szVar11, null, (h81) objF, g30Var2, 3072, 17);
                String strX17 = hH.x(R.string.settings_privacy_policy_title, g30Var2);
                sz szVar12 = g20.t;
                sz szVar13 = g20.u;
                g30Var2.e(1157296644);
                zI2 = g30Var2.I(j81Var);
                objF2 = g30Var2.f();
                if (zI2) {
                    objF2 = new bi4(j81Var);
                    g30Var2.B(objF2);
                } else {
                    objF2 = new bi4(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                q55.b(null, strX17, null, szVar12, szVar13, (h81) objF2, g30Var2, 27648, 5);
                String strX18 = hH.x(R.string.settings_about_version_title, g30Var2);
                str = this.z;
                if (str == null) {
                    str = "";
                }
                q55.b(null, strX18, str, g20.v, null, null, g30Var2, 3072, 49);
            }
            return sd5.a;
        }
    }

    public static final class RBi extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ vg4 w;
        public final /* synthetic */ j81<tg4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RBi(vg4 vg4Var, j81<? super tg4, sd5> j81Var, int i) {
            super(2);
            this.w = vg4Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ci4.f(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ Boolean w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(Boolean bool, boolean z) {
            super(3);
            this.w = bool;
            this.x = z;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            String strX;
            wv wvVar2 = wvVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(wvVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                da.CQf cQf2 = One.QnHx.k;
                g30Var2.e(693286680);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var2);
                g30Var2.e(-1323940314);
                jt4 jt4Var = r40.e;
                ij0 ij0Var = (ij0) g30Var2.E(jt4Var);
                jt4 jt4Var2 = r40.k;
                jy1 jy1Var = (jy1) g30Var2.E(jt4Var2);
                jt4 jt4Var3 = r40.o;
                ti5 ti5Var = (ti5) g30Var2.E(jt4Var3);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(qnHx);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                a30.QnHx.F1 f1 = a30.QnHx.e;
                hH.u(g30Var2, rb2VarA, f1);
                a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
                hH.u(g30Var2, ij0Var, c0012QnHx);
                a30.QnHx.CQf cQf3 = a30.QnHx.f;
                hH.u(g30Var2, jy1Var, cQf3);
                a30.QnHx.NUlFixed nUl = a30.QnHx.g;
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, nUl, g30Var2), g30Var2, 2058660585, -678309503);
                wj4 wj4VarK = ac.k(g30Var2);
                boolean z = this.x;
                pg2 pg2VarD = hn.d(qnHx, z, wj4VarK);
                ej1 ej1VarD = C0239D.A;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.WorkspacePremium");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(9.68f, 13.69f);
                    le3Var.g(12.0f, 11.93f);
                    le3Var.h(2.31f, 1.76f);
                    le3Var.h(-0.88f, -2.85f);
                    le3Var.g(15.75f, 9.0f);
                    le3Var.f(-2.84f);
                    le3Var.g(12.0f, 6.19f);
                    le3Var.g(11.09f, 9.0f);
                    le3Var.e(8.25f);
                    le3Var.h(2.31f, 1.84f);
                    le3Var.g(9.68f, 13.69f);
                    le3Var.b();
                    le3Var.i(20.0f, 10.0f);
                    le3Var.d(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                    le3Var.k(-8.0f, 3.58f, -8.0f, 8.0f);
                    le3Var.d(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
                    le3Var.m(23.0f);
                    le3Var.h(6.0f, -2.0f);
                    le3Var.h(6.0f, 2.0f);
                    le3Var.n(-7.72f);
                    le3Var.c(19.24f, 13.87f, 20.0f, 12.03f, 20.0f, 10.0f);
                    le3Var.b();
                    le3Var.i(12.0f, 4.0f);
                    le3Var.d(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                    le3Var.k(-2.69f, 6.0f, -6.0f, 6.0f);
                    le3Var.k(-6.0f, -2.69f, -6.0f, -6.0f);
                    le3Var.j(8.69f, 4.0f, 12.0f, 4.0f);
                    le3Var.b();
                    le3Var.i(12.0f, 19.0f);
                    le3Var.h(-4.0f, 1.02f);
                    le3Var.n(-3.1f);
                    le3Var.c(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f);
                    le3Var.k(2.82f, -0.4f, 4.0f, -1.08f);
                    le3Var.n(3.1f);
                    le3Var.g(12.0f, 19.0f);
                    le3Var.b();
                    qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx3.d();
                    C0239D.A = ej1VarD;
                }
                rh1.a(ej1VarD, null, pg2VarD, 0L, g30Var2, 48, 8);
                pq4.a(16, g30Var2, 6);
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx4 = wo1.a;
                mz1 mz1Var = new mz1(1.0f, true);
                g30Var2.e(-483455358);
                rb2 rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var2 = (jy1) g30Var2.E(jt4Var2);
                ti5 ti5Var2 = (ti5) g30Var2.E(jt4Var3);
                sz szVarJ2 = S12N.j(mz1Var);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                qc0.c(0, szVarJ2, Xs.b(g30Var2, g30Var2, rb2VarA2, f1, g30Var2, ij0Var2, c0012QnHx, g30Var2, jy1Var2, cQf3, g30Var2, ti5Var2, nUl, g30Var2), g30Var2, 2058660585, -1163856341);
                Uff4.a(R.string.pref_premium_category, hn.d(qnHx, z, ac.k(g30Var2)), g30Var2, 0, 0);
                float f = 8;
                pq4.c(f, g30Var2, 6);
                pg2 pg2VarD2 = hn.d(qnHx, z, ac.k(g30Var2));
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = this.w;
                if (ur1.a(bool2, bool)) {
                    g30Var2.e(394898877);
                    strX = hH.x(R.string.pref_has_premium, g30Var2);
                    g30Var2.G();
                } else {
                    g30Var2.e(394898977);
                    strX = hH.x(R.string.pref_premium_summary, g30Var2);
                    g30Var2.G();
                }
                j55.b(strX, pg2VarD2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32764);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                if (ur1.a(bool2, Boolean.FALSE)) {
                    pq4.c(f, g30Var2, 6);
                    q40.a(new ng3[]{r70.a.b(new yu(((rv) g30Var2.E(sv.a)).g()))}, X.m(g30Var2, -519496284, new hi4(wvVar2)), g30Var2, 56);
                }
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i, j81 j81Var) {
            super(2);
            this.w = j81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ci4.c(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(j81<? super tg4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(new tg4.byN());
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Boolean w;
        public final /* synthetic */ j81<tg4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(int i, Boolean bool, j81 j81Var) {
            super(2);
            this.w = bool;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ci4.d(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class y extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<tg4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(j81<? super tg4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(tg4.F1.a);
            return sd5.a;
        }
    }

    public static final void a(String str, Boolean bool, j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(415940475);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(bool) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, 2138884714, new QnHx(i2, bool, str, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i, bool, str, j81Var);
    }

    public static final void b(j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1832134189);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, 168914780, new F1(i2, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(i, j81Var);
    }

    public static final void c(j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-790974979);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -811169106, new NUlFixed(i2, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(i, j81Var);
    }

    public static final void d(Boolean bool, j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1778993938);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            boolean z = bool == null;
            pg2.QnHx qnHx = pg2.QnHx.w;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new auxFixed(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            a_.b(null, 0L, 0.0f, hr.c(qnHx, false, (h81) objB0, 7), 0.0f, X.m(j30VarQ, -327724897, new T23(bool, z)), j30VarQ, 196608, 23);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(i, bool, j81Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-1649835014);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1790077986);
            Context context = (Context) j30VarQ.E(Ll.b);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            j30VarQ.e(1281784410);
            yf yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            oi4 oi4Var = oi4.w;
            qi4 qi4Var = new qi4(context, bm2Var, sn4Var, yfVarB);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(oi4Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(qi4Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(ri4.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            ri4 ri4Var = (ri4) ((ZUx) obj);
            j30VarQ.R(false);
            vg4 vg4Var = (vg4) ps0.t(ri4Var.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(ri4Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new EQ(ri4Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            f(vg4Var, (j81) objB1, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new FJCM(i);
    }

    public static final void f(vg4 vg4Var, j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1244490481);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(vg4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-960603446);
            boolean z = vg4Var.a;
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (z) {
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == c0132QnHx) {
                    objB0 = new PRnFixed(j81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                lv2.a((h81) objB0, j30VarQ, 0);
            }
            j30VarQ.R(false);
            j30VarQ.e(-960603284);
            if (vg4Var.b) {
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(j81Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new y(j81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                oa5.a((h81) objB1, j30VarQ, 0);
            }
            j30VarQ.R(false);
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 16;
            pg2 pg2VarT = ps0.T(ob.x(qnHx, ob.w(0, j30VarQ, 1)), f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarT);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            int i4 = i3 & 112;
            d(vg4Var.d, j81Var, j30VarQ, i4);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            int i5 = (i3 >> 3) & 14;
            b(j81Var, j30VarQ, i5);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            c(j81Var, j30VarQ, i5);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            ug4 ug4Var = vg4Var.c;
            g(ug4Var != null ? Boolean.valueOf(ug4Var.a) : null, j81Var, j30VarQ, i4);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            a(vg4Var.e, ug4Var != null ? Boolean.valueOf(ug4Var.b) : null, j81Var, j30VarQ, (i3 << 3) & 896);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new RBi(vg4Var, j81Var, i);
    }

    public static final void g(Boolean bool, j81<? super tg4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-821748844);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -1213534331, new MZ(i2, bool, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt6Fixed(i, bool, j81Var);
    }

    public static final void h(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1097714452);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            q70.a(g20.w, j30VarQ, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new gi4(i);
    }

    public static final void i(int i, g30 g30Var, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(416189350);
        if ((i2 & 14) == 0) {
            i3 = (j30VarQ.i(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            Uff4.a(i, ps0.X(pg2.QnHx.w, 56, f, f, 0.0f, 8), j30VarQ, (i3 & 14) | 48, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ii4(i, i2);
    }
}
