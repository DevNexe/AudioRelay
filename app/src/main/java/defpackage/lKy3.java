package defpackage;

import android.content.Context;
import android.os.Build;
import com.azefsw.audioconnect.R;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class lKy3 extends ua3 implements z63 {
    public static final long u;
    public static final long v;
    public static final /* synthetic */ int w = 0;
    public final ta2 d;
    public final LPt8Fixed e;
    public final F1 f;
    public final CQf g;
    public final CQf h;
    public final F1 i;
    public final CQf j;
    public final F1 k;
    public final F1 l;
    public final F1 m;
    public final CQf n;
    public final CQf o;
    public final CQf p;
    public final CQf q;
    public final F1 r;
    public final ra3<Integer> s;
    public final CQf t;

    public final class CQf extends QnHx<Boolean> {
        public final boolean c;

        public CQf(lKy3 lky3, String str, boolean z) {
            super(lky3, str);
            this.c = z;
        }

        @Override // defpackage.ra3
        public final Object getValue() {
            return Boolean.valueOf(this.a.c(this.b, this.c));
        }

        @Override // defpackage.ra3
        public final void setValue(Object obj) {
            this.a.g(this.b, ((Boolean) obj).booleanValue());
        }
    }

    public final class F1 extends QnHx<Integer> {
        public final int c;

        public F1(lKy3 lky3, String str, int i) {
            super(lky3, str);
            this.c = i;
        }

        @Override // defpackage.ra3
        public final Object getValue() {
            return Integer.valueOf(this.a.e().getInt(this.b, this.c));
        }

        @Override // defpackage.ra3
        public final void setValue(Object obj) {
            this.a.h(((Number) obj).intValue(), this.b);
        }
    }

    public final class LPt8Fixed extends QnHx<String> {
        public LPt8Fixed(lKy3 lky3) {
            super(lky3, "device_name");
        }

        @Override // defpackage.ra3
        public final Object getValue() {
            String strF = this.a.f(this.b);
            return strF == null ? "" : strF;
        }

        @Override // defpackage.ra3
        public final void setValue(Object obj) {
            this.a.i(this.b, (String) obj);
        }
    }

    public static abstract class QnHx<T> implements ra3<T> {
        public final lKy3 a;
        public final String b;

        /* JADX INFO: renamed from: lKy3$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0162QnHx extends cx1 implements h81<T> {
            public final /* synthetic */ QnHx<T> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0162QnHx(QnHx<T> qnHx) {
                super(0);
                this.w = qnHx;
            }

            @Override // defpackage.h81
            public final T invoke() {
                return this.w.getValue();
            }
        }

        public QnHx(lKy3 lky3, String str) {
            this.a = lky3;
            this.b = str;
        }

        @Override // defpackage.ra3
        public final vq2<T> a(c54 c54Var) {
            hr2 hr2VarJ = this.a.j(this.b, c54Var, new C0162QnHx(this));
            return c54Var != null ? hr2VarJ.u(c54Var) : hr2VarJ;
        }
    }

    static {
        gq0.QnHx qnHx = gq0.x;
        u = ps0.o0(30, kq0.MILLISECONDS);
        v = ps0.o0(5, kq0.MINUTES);
    }

    public lKy3(Context context, ta2 ta2Var) {
        super(context);
        this.d = ta2Var;
        this.e = new LPt8Fixed(this);
        this.f = new F1(this, "main_fragment_tab_position", -1);
        this.g = new CQf(this, "synced_revenue_cat", false);
        this.h = new CQf(this, "handle_noisy_events", true);
        this.i = new F1(this, "pref_done_intro_version", -1);
        this.j = new CQf(this, "forced_server_audio_option_compression", true);
        this.k = new F1(this, "forced_server_audio_option_compression_bitrate", 128000);
        this.l = new F1(this, "forced_server_audio_option_compression_minimum_buffer", 0);
        this.m = new F1(this, "forced_server_audio_option_compression_maximum_buffer", 100);
        this.n = new CQf(this, "automatically_activate_bluetooth_sco", true);
        this.o = new CQf(this, "is_noise_suppressor_enabled", true);
        this.p = new CQf(this, "is_echo_cancellation_enabled", true);
        this.q = new CQf(this, "is_automatic_gain_control_enabled", true);
        this.r = new F1(this, "mic_audio_source", 0);
        int i = Build.VERSION.SDK_INT;
        this.s = i >= 25 ? new F1(this, "open_sl_performance_mode", 3) : new t60<>(-1);
        this.t = new CQf(this, "android11_media_style_notification_enabled", i >= 30);
    }

    @Override // defpackage.z63
    public final rFi a() {
        Object objC;
        String strF = f(d(R.string.pref_audiofocus_strategy_key));
        if (strF == null) {
            objC = null;
        } else {
            ws1 ws1Var = (ws1) this.d.x;
            objC = ws1Var.c(ib4.serializer(ws1Var.b, nl3.b(ft1.class)), strF);
        }
        ft1 ft1Var = (ft1) objC;
        rFi rfi = rFi.Ignore;
        rFi rfi2 = rFi.Respect;
        if (ft1Var == null) {
            if (c(d(R.string.pref_respect_audio_focus_key), true)) {
                rfi = rfi2;
            }
            r(rfi);
            return rfi;
        }
        int iOrdinal = ft1Var.ordinal();
        if (iOrdinal == 0) {
            return rfi2;
        }
        if (iOrdinal == 1) {
            return rfi;
        }
        rFi rfi3 = rFi.RestartOnPhoneCall;
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return rfi3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.z63
    public final CQf b() {
        return this.t;
    }

    public final hr2 j(String str, c54 c54Var, h81 h81Var) {
        int i = 1;
        vq2 cs2Var = new cs2(new pr2((dw4) this.b.getValue(), new tz4(str, i)), new j14(i));
        if (c54Var != null) {
            cs2Var = cs2Var.u(c54Var);
        }
        vq2 vq2VarW = new cs2(cs2Var, new D(h81Var, 18)).w(new ur2(new r23(h81Var, 2)));
        vq2VarW.getClass();
        return new hr2(vq2VarW);
    }

    public final A$Y4 k() {
        Object objC;
        int iOrdinal;
        String strF = f(d(R.string.pref_audio_output_type_key));
        if (strF == null) {
            objC = null;
        } else {
            ws1 ws1Var = (ws1) this.d.x;
            objC = ws1Var.c(ib4.serializer(ws1Var.b, nl3.b(gt1.class)), strF);
        }
        gt1 gt1Var = (gt1) objC;
        A$Y4 a$y4 = A$Y4.OpenSL;
        if (gt1Var == null || (iOrdinal = gt1Var.ordinal()) == 0) {
            return a$y4;
        }
        if (iOrdinal == 1) {
            return A$Y4.AudioTrack;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final mg l() {
        Object objC;
        String strF = f(d(R.string.pref_buffer_size_mode_key));
        if (strF == null) {
            objC = null;
        } else {
            ws1 ws1Var = (ws1) this.d.x;
            objC = ws1Var.c(ib4.serializer(ws1Var.b, nl3.b(ht1.class)), strF);
        }
        ht1 ht1Var = (ht1) objC;
        return ht1Var != null ? kK.g(ht1Var) : mg.Low;
    }

    public final ad0 m() {
        Object objC;
        String strF = f(d(R.string.pref_custom_buffer_mode_key));
        if (strF == null) {
            objC = null;
        } else {
            ws1 ws1Var = (ws1) this.d.x;
            objC = ws1Var.c(ib4.serializer(ws1Var.b, nl3.b(nt1.class)), strF);
        }
        nt1 nt1Var = (nt1) objC;
        return nt1Var != null ? new ad0((int) nt1Var.a, (int) nt1Var.b) : ad0.c;
    }

    public final boolean n() {
        return c(d(R.string.pref_enable_compression_key), true);
    }

    public final boolean o() {
        return f(d(R.string.pref_audio_output_type_key)) != null;
    }

    public final dk4 p() {
        int i = e().getInt(d(R.string.pref_show_usb_card_serialization_key), 0);
        for (dk4 dk4Var : dk4.values()) {
            if (dk4Var.w == i) {
                return dk4Var;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final hr2 q() {
        return j(d(R.string.pref_show_usb_card_serialization_key), null, new ma8Z(this));
    }

    public final void r(rFi rfi) {
        ft1 ft1Var;
        String strD = d(R.string.pref_audiofocus_strategy_key);
        int iOrdinal = rfi.ordinal();
        if (iOrdinal == 0) {
            ft1Var = ft1.Respect;
        } else if (iOrdinal == 1) {
            ft1Var = ft1.Ignore;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ft1Var = ft1.RestartOnPhoneCall;
        }
        ws1 ws1Var = (ws1) this.d.x;
        i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(ft1.class)), ft1Var));
    }

    public final void s(A$Y4 a$y4) {
        gt1 gt1Var;
        String strD = d(R.string.pref_audio_output_type_key);
        int iOrdinal = a$y4.ordinal();
        if (iOrdinal == 0) {
            gt1Var = gt1.OpenSL;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    throw new lp2();
                }
                if (iOrdinal == 3) {
                    throw new lp2();
                }
                throw new NoWhenBranchMatchedException();
            }
            gt1Var = gt1.AudioTrack;
        }
        ws1 ws1Var = (ws1) this.d.x;
        i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(gt1.class)), gt1Var));
        a62.a.j("audio_output", a$y4.w);
    }

    public final void t(mg mgVar) {
        ht1 ht1Var;
        String strD = d(R.string.pref_buffer_size_mode_key);
        int iOrdinal = mgVar.ordinal();
        if (iOrdinal == 0) {
            ht1Var = ht1.Low;
        } else if (iOrdinal == 1) {
            ht1Var = ht1.Medium;
        } else if (iOrdinal == 2) {
            ht1Var = ht1.High;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ht1Var = ht1.Custom;
        }
        ws1 ws1Var = (ws1) this.d.x;
        i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(ht1.class)), ht1Var));
    }
}
