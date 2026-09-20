package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class sm3 implements fm3 {
    public final gy0 a;
    public final ta2 b;
    public final ry4 c = new ry4(new FJCM());
    public final ry4 d = new ry4(new T23());
    public final ry4 e = new ry4(new LPt8Fixed());
    public final ry4 f = new ry4(new CQf());
    public final ry4 g = new ry4(new F1());
    public final ry4 h = new ry4(new auxFixed());
    public final ry4 i = new ry4(new lPt3Fixed());
    public final ry4 j = new ry4(new Xn1());
    public final ry4 k = new ry4(new SjP());
    public final ry4 l = new ry4(new EQ());
    public final ry4 m = new ry4(new PRnFixed());
    public final ry4 n = new ry4(new RBi());
    public final ry4 o = new ry4(new MZ());
    public final ry4 p = new ry4(new LPt6Fixed());
    public final ry4 q = new ry4(new y());
    public final ry4 r = new ry4(new NUlFixed());
    public final ry4 s = new ry4(new QnHx());
    public final ry4 t = new ry4(new byN());
    public final ry4 u = new ry4(new YKK());
    public final ry4 v = new ry4(new ct());
    public final ry4 w = new ry4(new ck32());
    public final ry4 x = new ry4(new ta());
    public final ry4 y = new ry4(new LPt9Fixed());
    public final ry4 z = new ry4(new Aa());
    public final ry4 A = new ry4(new WE());

    public static final class Aa extends cx1 implements h81<vk4<Boolean>> {
        public Aa() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Boolean> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "should_show_usb_card_initial_value", Boolean.TRUE, 4000L, go3.w);
        }
    }

    public static final class CQf extends cx1 implements h81<vk4<Bs6V>> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Bs6V> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            Bs6V bs6V = new Bs6V(1, 1);
            return new fl4(sm3.z(sm3Var, vk4VarB, "ad_config", "", 10000L, xn3.w), new vm3(sm3Var, bs6V)).h(bs6V);
        }
    }

    public static final class EQ extends cx1 implements h81<vk4<A$Y4>> {
        public EQ() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<A$Y4> invoke() {
            sm3 sm3Var = sm3.this;
            vk4 vk4VarX = sm3.x(sm3Var);
            return new fl4(sm3.z(sm3Var, vk4VarX, "default_audio_output", "", 15000L, xn3.w), new on3(sm3Var)).h(A$Y4.OpenSL);
        }
    }

    public static final class F1 extends cx1 implements h81<vk4<LpT7Fixed>> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<LpT7Fixed> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            LpT7Fixed lpT7 = new LpT7Fixed(cs0.w);
            return new fl4(sm3.z(sm3Var, vk4VarB, "ad_keywords", "", 3000L, xn3.w), new ym3(sm3Var, lpT7)).h(lpT7);
        }
    }

    public static final class FJCM extends cx1 implements h81<vk4<cy0>> {
        public FJCM() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<cy0> invoke() {
            return new xk4(sm3.this.a.a.g(j54.c));
        }
    }

    public static final class LPt6Fixed extends cx1 implements h81<vk4<Double>> {
        public LPt6Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Double> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "full_screen_ad_volume_key", Double.valueOf(0.3d), 3000L, tn3.w);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<vk4<w1L>> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<w1L> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            w1L w1l = new w1L("", "", "", "");
            return new fl4(sm3.z(sm3Var, vk4VarB, "ad_unit_ids", "", 10000L, xn3.w), new dn3(sm3Var, w1l)).h(w1l);
        }
    }

    public static final class LPt9Fixed extends cx1 implements h81<vk4<String>> {
        public LPt9Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<String> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3.x(sm3Var), "premium_screen_warning", "", 10000L, co3.w);
        }
    }

    public static final class MZ extends cx1 implements h81<vk4<z61>> {
        public MZ() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<z61> invoke() {
            gq0.QnHx qnHx = gq0.x;
            return sm3.y(sm3.this, ps0.o0(30, kq0.SECONDS));
        }
    }

    public static final class NUlFixed extends cx1 implements h81<vk4<coNFixed>> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<coNFixed> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            return new fl4(sm3.z(sm3Var, vk4VarB, "ads_fragment_type", "", 500L, xn3.w), new gn3(sm3Var)).h(coNFixed.Rectangle);
        }
    }

    public static final class PRnFixed extends cx1 implements h81<vk4<x61>> {
        public PRnFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<x61> invoke() {
            sm3 sm3Var = sm3.this;
            vk4 vk4VarX = sm3.x(sm3Var);
            gq0.QnHx qnHx = gq0.x;
            kq0 kq0Var = kq0.MINUTES;
            x61 x61Var = new x61(ps0.o0(30, kq0Var), ps0.o0(29, kq0Var));
            return new fl4(sm3.z(sm3Var, vk4VarX, "full_screen_ad_config", "", 30000L, xn3.w), new rn3(sm3Var, x61Var)).h(x61Var);
        }
    }

    public static final class QnHx extends cx1 implements h81<vk4<Ytae>> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Ytae> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            return new fl4(sm3.z(sm3Var, vk4VarB, "ad_banner_strategy", "", 10000L, xn3.w), new rm3(sm3Var)).h(Ytae.Single);
        }
    }

    public static final class RBi extends cx1 implements h81<vk4<z61>> {
        public RBi() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<z61> invoke() {
            gq0.QnHx qnHx = gq0.x;
            return sm3.y(sm3.this, ps0.o0(RCHTTPStatusCodes.ERROR, kq0.MILLISECONDS));
        }
    }

    public static final class SjP extends cx1 implements h81<vk4<Boolean>> {
        public SjP() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Boolean> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "should_show_audio_output_card", Boolean.TRUE, 10000L, fo3.w);
        }
    }

    public static final class T23 extends cx1 implements h81<vk4<cy0>> {
        public T23() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<cy0> invoke() {
            gy0 gy0Var = sm3.this.a;
            gy0Var.getClass();
            return new xk4(new fl4(new il4(new dy0(0)), new Ot0r(gy0Var, 4)).g(j54.c));
        }
    }

    public static final class WE extends cx1 implements h81<vk4<Boolean>> {
        public WE() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Boolean> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "show_name_suggestions", Boolean.TRUE, 1000L, ho3.w);
        }
    }

    public static final class Xn1 extends cx1 implements h81<vk4<gq0>> {
        public Xn1() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<gq0> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3.x(sm3Var), "max_elapsed_time_between_payloads_in_ms", new gq0(lKy3.u), 10000L, ao3.w);
        }
    }

    public static final class YKK extends cx1 implements h81<vk4<gq0>> {
        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<gq0> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            gq0.QnHx qnHx = gq0.x;
            return sm3.z(sm3Var, vk4VarB, "ads_inactivity_period_minutes", new gq0(ps0.o0(5, kq0.MINUTES)), 2000L, hn3.w);
        }
    }

    public static final class auxFixed extends cx1 implements h81<vk4<og>> {
        public auxFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<og> invoke() {
            sm3 sm3Var = sm3.this;
            vk4 vk4VarX = sm3.x(sm3Var);
            og ogVar = og.c;
            return new xk4(new fl4(sm3.z(sm3Var, vk4VarX, "buffer_sizes", "", 500L, xn3.w), new kn3(sm3Var, ogVar)).h(ogVar));
        }
    }

    public static final class byN extends cx1 implements h81<vk4<Boolean>> {
        public byN() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Boolean> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "can_show_banner_backfill", Boolean.TRUE, 2000L, ln3.w);
        }
    }

    public static final class ck32 extends cx1 implements h81<vk4<gq0>> {
        public ck32() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<gq0> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            gq0.QnHx qnHx = gq0.x;
            return sm3.z(sm3Var, vk4VarB, "server_time_limit_in_minutes", new gq0(ps0.o0(60, kq0.MINUTES)), 5000L, eo3.w);
        }
    }

    public static final class ct extends cx1 implements h81<vk4<gq0>> {
        public ct() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<gq0> invoke() {
            sm3 sm3Var = sm3.this;
            vk4<cy0> vk4VarB = sm3Var.B();
            gq0.QnHx qnHx = gq0.x;
            return sm3.z(sm3Var, vk4VarB, "ads_wait_time_before_showing_ads_again_secs", new gq0(ps0.o0(2, kq0.SECONDS)), 2000L, io3.w);
        }
    }

    public static final class lPt3Fixed extends cx1 implements h81<vk4<gq0>> {
        public lPt3Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<gq0> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3.x(sm3Var), "retry_duration_in_secs", new gq0(lKy3.v), 10000L, do3.w);
        }
    }

    public static final class ta extends cx1 implements h81<vk4<bs3>> {
        public ta() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<bs3> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3.x(sm3Var), "premium_revenue_cat_offering", bs3.CQf.a, 6000L, bo3.w);
        }
    }

    public static final class y extends cx1 implements h81<vk4<Boolean>> {
        public y() {
            super(0);
        }

        @Override // defpackage.h81
        public final vk4<Boolean> invoke() {
            sm3 sm3Var = sm3.this;
            return sm3.z(sm3Var, sm3Var.B(), "full_screen_ad_is_muted_key", Boolean.TRUE, 3000L, sn3.w);
        }
    }

    public sm3(gy0 gy0Var, ta2 ta2Var) {
        this.a = gy0Var;
        this.b = ta2Var;
    }

    public static final void A(sm3 sm3Var, String str, Throwable th) {
        sm3Var.getClass();
        a62.a.h("remote_config", "deserialization_error", str);
        a62.a.d(th, true);
    }

    public static final vk4 x(sm3 sm3Var) {
        return (vk4) sm3Var.c.getValue();
    }

    public static final nl4 y(sm3 sm3Var, long j) {
        vk4<cy0> vk4VarB = sm3Var.B();
        z61 z61Var = new z61(y61.TryInterstitialThenAdsFragment);
        return new fl4(z(sm3Var, vk4VarB, "full_screen_ad_strategy_config", "", gq0.g(j), xn3.w), new wn3(sm3Var, z61Var)).h(z61Var);
    }

    public static final bl4 z(final sm3 sm3Var, vk4 vk4Var, final String str, Object obj, long j, j81 j81Var) {
        sm3Var.getClass();
        fl4 fl4Var = new fl4(new fl4(vk4Var, new D(str, 3)), new k71(4));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c54 c54Var = j54.b;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var == null) {
            throw new NullPointerException("scheduler is null");
        }
        final int i = 0;
        nl4 nl4VarH = new kl4(new al4(new al4(new ul4(fl4Var, j, timeUnit, c54Var), new m70(sm3Var) { // from class: mm3
            @Override // defpackage.m70
            public final void accept(Object obj2) {
                switch (i) {
                    case 0:
                        Throwable th = (Throwable) obj2;
                        boolean z = th instanceof TimeoutException;
                        String str2 = str;
                        if (z) {
                            a62.a.f("get_value_timed_out", new yn3(str2));
                        } else if (th instanceof jo3) {
                            a62.a.f("key_not_found", new zn3(str2));
                        }
                        break;
                }
            }
        }), new nm3(i, sm3Var, str)), new om3(0, j81Var)).h(obj);
        final int i2 = 1;
        return new bl4(nl4VarH, new m70(sm3Var) { // from class: mm3
            @Override // defpackage.m70
            public final void accept(Object obj2) {
                switch (i2) {
                    case 0:
                        Throwable th = (Throwable) obj2;
                        boolean z = th instanceof TimeoutException;
                        String str2 = str;
                        if (z) {
                            a62.a.f("get_value_timed_out", new yn3(str2));
                        } else if (th instanceof jo3) {
                            a62.a.f("key_not_found", new zn3(str2));
                        }
                        break;
                }
            }
        });
    }

    public final vk4<cy0> B() {
        return (vk4) this.d.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<String> a() {
        return (vk4) this.y.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<bs3> b() {
        return (vk4) this.x.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Boolean> c() {
        return (vk4) this.z.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<gq0> d() {
        return (vk4) this.v.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<gq0> e() {
        return (vk4) this.j.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Bs6V> f() {
        return (vk4) this.f.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<z61> g() {
        return (vk4) this.o.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<LpT7Fixed> h() {
        return (vk4) this.g.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<A$Y4> i() {
        return (vk4) this.l.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<gq0> j() {
        return (vk4) this.w.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<z61> k() {
        return (vk4) this.n.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<x61> l() {
        return (vk4) this.m.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<gq0> m() {
        return (vk4) this.u.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<og> n() {
        return (vk4) this.h.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Boolean> o() {
        return (vk4) this.k.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Boolean> p() {
        return (vk4) this.q.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<coNFixed> q() {
        return (vk4) this.r.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<w1L> r() {
        return (vk4) this.e.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Double> s() {
        return (vk4) this.p.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<gq0> t() {
        return (vk4) this.i.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Boolean> u() {
        return (vk4) this.t.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Boolean> v() {
        return (vk4) this.A.getValue();
    }

    @Override // defpackage.fm3
    public final vk4<Ytae> w() {
        return (vk4) this.s.getValue();
    }
}
