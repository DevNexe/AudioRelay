package com.azefsw.audioconnect;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.azefsw.audioconnect.network.exceptions.MessageException;
import com.azefsw.audioconnect.player.audio.output.audiotrack.AudioTrackWriteException;
import com.azefsw.audioconnect.player.audio.output.jni.NativeAudioOutputException;
import com.azefsw.audioconnect.player.decoders.OpusAudioDecoderException;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.Acr;
import defpackage.C0240Tp;
import defpackage.FNO9;
import defpackage.FWT;
import defpackage.JF;
import defpackage.KnU;
import defpackage.NFo7;
import defpackage.OW8;
import defpackage.Q1K;
import defpackage.Th;
import defpackage.Wu5C;
import defpackage.a62;
import defpackage.ac;
import defpackage.am1;
import defpackage.c54;
import defpackage.cf5;
import defpackage.ci;
import defpackage.cj3;
import defpackage.cl1;
import defpackage.cn1;
import defpackage.cs2;
import defpackage.d83;
import defpackage.dc;
import defpackage.df2;
import defpackage.dj3;
import defpackage.dm1;
import defpackage.dn1;
import defpackage.ds2;
import defpackage.en1;
import defpackage.er0;
import defpackage.eu;
import defpackage.fXUx;
import defpackage.fk3;
import defpackage.fn1;
import defpackage.fv1;
import defpackage.g52;
import defpackage.g7;
import defpackage.gf2;
import defpackage.gk3;
import defpackage.gl5;
import defpackage.gn1;
import defpackage.gt2;
import defpackage.he5;
import defpackage.hg5;
import defpackage.hk3;
import defpackage.hn;
import defpackage.hn1;
import defpackage.iE;
import defpackage.ik3;
import defpackage.in0;
import defpackage.in1;
import defpackage.iv4;
import defpackage.j54;
import defpackage.ji3;
import defpackage.jk1;
import defpackage.jl1;
import defpackage.jn1;
import defpackage.kb3;
import defpackage.kd;
import defpackage.ki3;
import defpackage.kn1;
import defpackage.kp;
import defpackage.ks;
import defpackage.lb3;
import defpackage.lf4;
import defpackage.lj3;
import defpackage.ln1;
import defpackage.ln2;
import defpackage.m14;
import defpackage.m91;
import defpackage.mi3;
import defpackage.ng;
import defpackage.nl3;
import defpackage.nm1;
import defpackage.oj3;
import defpackage.p32;
import defpackage.pf4;
import defpackage.pk1;
import defpackage.pm1;
import defpackage.pr2;
import defpackage.q32;
import defpackage.q72;
import defpackage.qOjh;
import defpackage.qd;
import defpackage.qj3;
import defpackage.ql1;
import defpackage.r14;
import defpackage.r32;
import defpackage.rk1;
import defpackage.rl1;
import defpackage.rp3;
import defpackage.rq1;
import defpackage.s32;
import defpackage.si3;
import defpackage.sl1;
import defpackage.su;
import defpackage.t12;
import defpackage.t32;
import defpackage.tl1;
import defpackage.tx0;
import defpackage.ty;
import defpackage.ul1;
import defpackage.ur1;
import defpackage.ur2;
import defpackage.va3;
import defpackage.vi3;
import defpackage.vl1;
import defpackage.vq2;
import defpackage.wi3;
import defpackage.wj3;
import defpackage.wq3;
import defpackage.xi3;
import defpackage.xnX3;
import defpackage.xv0;
import defpackage.y40;
import defpackage.yi3;
import defpackage.yl1;
import defpackage.yl2;
import defpackage.yr4;
import defpackage.zg4;
import defpackage.zj3;
import defpackage.zouF;
import defpackage.zqJF;
import defpackage.zs;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AudioConnectApp extends Application {
    public static final /* synthetic */ int x = 0;
    public QnHx w;

    public static final class QnHx {
        public final pf4 a;
        public final r14 b;
        public final lf4 c;
        public final yr4 d;

        public QnHx(pf4 pf4Var, r14 r14Var, lf4 lf4Var, yr4 yr4Var) {
            this.a = pf4Var;
            this.b = r14Var;
            this.c = lf4Var;
            this.d = yr4Var;
        }
    }

    @Override // android.app.Application
    public final void onCreate() throws NoSuchFieldException {
        char c;
        char c2;
        super.onCreate();
        System.setProperty("kotlinx.coroutines.io.parallelism", "2147483647");
        m14.b = new KnU(0);
        m14.c = new Acr(0);
        kd.w = this;
        zs.QnHx.a = new iE();
        eu.y = Q1K.w;
        ac.b.a = new OW8();
        a62 a62Var = a62.a;
        a62Var.c("Setting up locale...");
        Locale locale = Locale.getDefault();
        p32.f.getClass();
        va3 va3Var = new va3(this, locale);
        if (!(p32.e == null)) {
            throw new IllegalStateException("Already initialized".toString());
        }
        p32 p32Var = new p32(va3Var, new he5());
        registerActivityLifecycleCallbacks(new s32(new q32(p32Var)));
        registerComponentCallbacks(new t32(new r32(p32Var, this)));
        Locale localeD = va3Var.a() ? p32Var.a : va3Var.d();
        va3Var.c(localeD);
        he5.a(this, localeD);
        Context applicationContext = getApplicationContext();
        if (applicationContext != this) {
            he5.a(applicationContext, localeD);
        }
        p32.e = p32Var;
        p32 p32VarA = p32.QnHx.a();
        Locale localeD2 = p32VarA.b.d();
        if (!p32VarA.b.a() && !ur1.a(locale, localeD2)) {
            a62Var.c("Preloading a WebView...");
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                new WebView(this).destroy();
                a62Var.k("WebView loaded in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            } catch (Exception e) {
                a62 a62Var2 = a62.a;
                a62Var2.b("Failed to preload WebView", e);
                a62Var2.d(e, false);
            }
            a62.a.c("Setting the locale to " + localeD2 + "...");
            g52 g52Var = p32VarA.b;
            g52Var.b(false);
            g52Var.c(localeD2);
            p32VarA.c.getClass();
            he5.a(this, localeD2);
            Context applicationContext2 = getApplicationContext();
            if (applicationContext2 != this) {
                he5.a(applicationContext2, localeD2);
            }
        }
        nl3.a(yi3.class);
        sl1 sl1Var = new sl1(new tx0(this), new kp(new g7()));
        nl3.a(ki3.class);
        pk1 pk1Var = new pk1(this, new er0(new rp3(R.string.app_name), new hg5()));
        nl3.a(wj3.class);
        nm1 nm1Var = new nm1();
        nl3.a(vi3.class);
        jl1 jl1Var = new jl1(new ci(), nm1Var, pk1Var);
        nl3.a(hk3.class);
        en1 en1Var = new en1();
        nl3.a(qj3.class);
        dm1 dm1Var = new dm1(pk1Var, jl1Var, en1Var);
        lb3.b = new lb3(dm1Var);
        ql1 ql1Var = ql1.w;
        yr4 yr4Var = (yr4) jl1Var.E.a("yr4", ql1Var);
        Set setU = Th.u(dm1Var.d(), (kb3) dm1Var.d.a("kb3", new am1(dm1Var)));
        if (!(!yr4Var.a)) {
            throw new IllegalStateException("Services already retrieved, can't add anymore".toString());
        }
        yr4Var.b.addAll(setU);
        su.x0(Th.u(new zqJF(jl1Var.C()), new y40(jl1Var.C()), new ng(jl1Var.C())), ((kb3) dm1Var.d.a("kb3", new am1(dm1Var))).b);
        nl3.a(mi3.class);
        rk1 rk1Var = new rk1(jl1Var, dm1Var, pk1Var);
        gn1 gn1Var = new gn1(pk1Var, jl1Var, dm1Var);
        hn1 hn1Var = new hn1(pk1Var, rk1Var, jl1Var);
        nl3.a(oj3.class);
        yl1 yl1Var = new yl1(jl1Var, nm1Var, rk1Var, gn1Var, hn1Var);
        nl3.a(ik3.class);
        fn1 fn1Var = new fn1();
        nl3.a(dj3.class);
        nl3.a(cj3.class);
        ul1 ul1Var = new ul1(new tl1(jl1Var, nm1Var, yl1Var, en1Var));
        ln1.b = new ln1(ul1Var);
        yl2 yl2Var = new yl2();
        JF jf = new JF();
        nl3.a(ji3.class);
        jk1 jk1Var = new jk1(jl1Var, pk1Var, yl1Var, fn1Var, en1Var, yl2Var, dm1Var);
        Wu5C.b = new Wu5C(jk1Var);
        nl3.a(gk3.class);
        dn1 dn1Var = new dn1(pk1Var, jl1Var, nm1Var, yl1Var, rk1Var, en1Var, ul1Var, jk1Var, yl2Var, dm1Var);
        zouF.b = new zouF(dn1Var);
        nl3.a(si3.class);
        cl1 cl1Var = new cl1(jl1Var, dm1Var, pk1Var);
        su.x0(Collections.singleton(new df2(new gf2(jl1Var.r()))), ((kb3) dm1Var.d.a("kb3", new am1(dm1Var))).b);
        in1 in1Var = new in1(jl1Var, cl1Var);
        jn1 jn1Var = jn1.w;
        kn1 kn1Var = new kn1(jl1Var, cl1Var);
        nl3.a(zj3.class);
        pm1 pm1Var = new pm1(jl1Var, cl1Var, in1Var, jn1Var, kn1Var);
        nl3.a(wi3.class);
        rl1 rl1Var = new rl1(pk1Var, jl1Var, pm1Var, cl1Var, en1Var, yl2Var, dm1Var);
        ks.c = new ks(rl1Var);
        nl3.a(fk3.class);
        cn1 cn1Var = new cn1(pk1Var, jl1Var, yl1Var, en1Var, yl2Var, jf, dm1Var);
        zg4.b = new zg4(cn1Var);
        nl3.a(lj3.class);
        vl1 vl1Var = new vl1(sl1Var, pk1Var, yl1Var, jl1Var, fn1Var, en1Var, jk1Var, dm1Var);
        q72.c = new q72(vl1Var, new xv0(jk1Var.d(), rl1Var.b(), dn1Var.c(), cn1Var.a(), dm1Var.b()));
        yl2Var.a = vl1Var;
        jf.a = vl1Var;
        nl3.a(xi3.class);
        yr4 yr4Var2 = (yr4) jl1Var.E.a("yr4", ql1Var);
        Set setU2 = Th.u(jl1Var.z(), new qd(pk1Var.a, jl1Var.f()), new gl5(jl1Var.B(), yl1Var.c(), pm1Var.d()), jl1Var.A());
        if (!(!yr4Var2.a)) {
            throw new IllegalStateException("Services already retrieved, can't add anymore".toString());
        }
        yr4Var2.b.addAll(setU2);
        pf4 pf4Var = new pf4(pk1Var.a, 2);
        jl1Var.C();
        QnHx qnHx = new QnHx(pf4Var, sl1Var.b(), yl1Var.k(), (yr4) jl1Var.E.a("yr4", ql1Var));
        t12 t12Var = jl1Var.E;
        Field declaredField = t12Var.getClass().getDeclaredField("map");
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(t12Var);
        if (!(!map.keySet().isEmpty())) {
            throw new IllegalStateException("Check the order of operations".toString());
        }
        Set setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 1;
                    c2 = 0;
                    break;
                } else if (iv4.x((String) it.next(), "com.azefsw", false)) {
                    c = 1;
                    c2 = 1;
                    break;
                }
            }
        } else {
            c = 1;
            c2 = 0;
            break;
        }
        if ((c ^ c2) == 0) {
            throw new IllegalStateException("Check the proguard config".toString());
        }
        this.w = qnHx;
        r14 r14Var = qnHx.b;
        int i = 7;
        fv1[] fv1VarArr = new fv1[7];
        fv1VarArr[0] = nl3.a(MessageException.class);
        fv1VarArr[c] = nl3.a(InvalidProtocolBufferException.class);
        fv1VarArr[2] = nl3.a(wq3.class);
        fv1VarArr[3] = nl3.a(AudioTrackWriteException.class);
        fv1VarArr[4] = nl3.a(NativeAudioOutputException.class);
        int i2 = 5;
        fv1VarArr[5] = nl3.a(cf5.class);
        fv1VarArr[6] = nl3.a(OpusAudioDecoderException.class);
        List<? extends fv1<? extends Throwable>> list = r14Var.w;
        ArrayList arrayList = new ArrayList(list.size() + 7);
        arrayList.addAll(list);
        arrayList.addAll(Arrays.asList(fv1VarArr));
        r14Var.w = arrayList;
        QnHx qnHx2 = this.w;
        if (qnHx2 == null) {
            ur1.e("deps");
            throw null;
        }
        m14.a = qnHx2.b;
        QnHx qnHx3 = this.w;
        if (qnHx3 == null) {
            ur1.e("deps");
            throw null;
        }
        lf4 lf4Var = qnHx3.c;
        lf4Var.getClass();
        c54 c54Var = j54.b;
        ln2 ln2Var = lf4Var.a;
        vq2 vq2VarI = FWT.I(ln2Var, c54Var);
        ds2 ds2VarC = ln2Var.c(c54Var);
        g7 g7Var = new g7();
        if (ds2VarC == null) {
            throw new NullPointerException("other is null");
        }
        gt2 gt2Var = new gt2(vq2VarI, ds2VarC, g7Var);
        dc dcVar = new dc(lf4Var, 2);
        m91.LPt6Fixed lPt6 = m91.e;
        m91.T23 t23 = m91.c;
        gt2Var.y(dcVar, lPt6, t23);
        ds2 ds2VarF = ln2Var.f(c54Var);
        fXUx fxux = fXUx.y;
        ds2VarF.getClass();
        new pr2(ds2VarF, fxux).B(new d83(ln2Var, c54Var)).B(new NFo7(lf4Var, 13)).y(new rq1(lf4Var, i2), lPt6, t23);
        j54.c.b(new ty(this, i));
        new cs2(new ur2(new qOjh(this)), FNO9.w).o(hn.z).i(c54Var).f(in0.a, xnX3.w);
        C0240Tp c0240Tp = C0240Tp.c;
        c0240Tp.a = true;
        c0240Tp.b.b();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        a62.a.e("on_low_memory");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        a62 a62Var = a62.a;
    }
}
