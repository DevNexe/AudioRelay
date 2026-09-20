package defpackage;

import android.bluetooth.BluetoothHeadset;
import android.util.Log;
import androidx.activity.ComponentActivity;
import com.facebook.ads.AdError;
import com.google.protobuf.QnHx;
import j$.util.Optional;
import j$.util.function.Function;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ D(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String string;
        jy0 jy0Var;
        d73.CQf cQf;
        d73.QnHx qnHxR;
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        switch (this.w) {
            case 0:
                return new yk4(new Z7O(i, (EWe) this.x, (ComponentActivity) obj));
            case 1:
                return ((Boolean) obj).booleanValue() ? new kl4(((nq1) this.x).b.a(), new KnU(5)).j() : vq2.s(Boolean.FALSE);
            case 2:
                SfnP sfnP = (SfnP) obj;
                return new fl4(sfnP.a.a(), new j71(z ? 1 : 0, sfnP, ((w71) this.x).a));
            case 3:
                final String str = (String) this.x;
                j50 j50Var = ((cy0) obj).f;
                g50 g50VarA = j50.a(j50Var.c);
                String string2 = null;
                if (g50VarA != null) {
                    try {
                        string = g50VarA.b.getString(str);
                    } catch (JSONException unused) {
                        string = null;
                    }
                    break;
                } else {
                    string = null;
                }
                if (string != null) {
                    final g50 g50VarA2 = j50.a(j50Var.c);
                    if (g50VarA2 != null) {
                        synchronized (j50Var.a) {
                            for (final z9 z9Var : j50Var.a) {
                                j50Var.b.execute(new Runnable() { // from class: i50
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        z9Var.a(str, g50VarA2);
                                    }
                                });
                            }
                        }
                    }
                    jy0Var = new jy0(string, 2);
                    break;
                } else {
                    g50 g50VarA3 = j50.a(j50Var.d);
                    if (g50VarA3 != null) {
                        try {
                            string2 = g50VarA3.b.getString(str);
                            break;
                        } catch (JSONException unused2) {
                        }
                    }
                    if (string2 != null) {
                        jy0Var = new jy0(string2, 1);
                    } else {
                        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
                        jy0Var = new jy0("", 0);
                    }
                }
                return vk4.f(jy0Var);
            case 4:
                return Boolean.valueOf(r80.a(((qb) this.x).a, "android.permission.BLUETOOTH_CONNECT") == 0);
            case 5:
                kk0.CQf cQf2 = (kk0.CQf) this.x;
                t54 t54Var = (t54) obj;
                boolean zA = ur1.a(t54Var, t54.QnHx.a);
                String str2 = cQf2.a;
                if (zA) {
                    return new jc.CQf(str2, false, false);
                }
                if (ur1.a(t54Var, t54.CQf.a)) {
                    return new jc.CQf(str2, true, false);
                }
                if (ur1.a(t54Var, t54.F1.a)) {
                    return new jc.CQf(str2, false, false);
                }
                if (t54Var instanceof t54.LPt8Fixed) {
                    return new jc.CQf(str2, false, true);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                return (BluetoothHeadset) this.x;
            case 7:
                un2 un2Var = (un2) this.x;
                uy2 uy2Var = (uy2) obj;
                zt4 zt4Var = (zt4) uy2Var.w;
                String str3 = (String) uy2Var.x;
                v9<Boolean> v9Var = un2Var.c;
                Boolean bool = v9Var.w.get();
                Boolean bool2 = Boolean.TRUE;
                if (ur1.a(bool, bool2)) {
                    a62.a.e("try_restart_already_called");
                    return cx.w;
                }
                v9Var.accept(bool2);
                un2Var.a.e(zt4Var, str3);
                v9Var.accept(Boolean.FALSE);
                return cx.w;
            case 8:
                return new uy2((zt4) this.x, (String) obj);
            case 9:
                return ((Boolean) obj).booleanValue() ? vq2.s(Boolean.TRUE) : ((s23) this.x).c.x(Boolean.FALSE);
            case 10:
                return ((wk5) this.x).a();
            case 11:
                wf3 wf3VarH = FWT.H((h04) obj);
                ad2.CQf cQfW0 = ad2.w0();
                xf3.CQf cQfU = xf3.B.c();
                cQfU.A = wf3VarH;
                cQfU.M();
                cQfW0.S = cQfU.build();
                cQfW0.M();
                return cQfW0.build();
            case 12:
                yb4 yb4Var = (yb4) this.x;
                return new yb4(yb4Var.w, yb4Var.x, yb4Var.y, (h04) obj);
            case 13:
                j83 j83Var = (j83) this.x;
                gq4 gq4Var = j83Var.b;
                synchronized (gq4Var.a) {
                    cQf = new d73.CQf(gq4Var.g, wu.e1(gq4Var.h), gq4Var.f, gq4Var.e, gq4Var.j);
                    gq4Var.f = 0L;
                    gq4Var.e = 0L;
                    gq4Var.j = false;
                    gq4Var.g = 0;
                    gq4Var.h.clear();
                    gq4Var.i.clear();
                }
                Bk bk = j83Var.a.a;
                if (bk == null || (qnHxR = bk.r()) == null) {
                    qnHxR = d73.QnHx.h;
                }
                return new uy2(cQf, qnHxR);
            case 14:
                VQko vQko = (VQko) obj;
                dw4<T> dw4Var = ((h1) this.x).f.a;
                CY cy = new CY(7);
                m91.byN byn = m91.d;
                m91.T23 t23 = m91.c;
                dw4Var.getClass();
                vq2<R> vq2VarB = new jr2(dw4Var, cy, byn, t23).B(new k71(13));
                NFo7 nFo7 = new NFo7(vQko, 14);
                vq2VarB.getClass();
                return new cs2(vq2VarB, nFo7).x(vQko);
            case 15:
                final af0 af0Var = (af0) this.x;
                return (tx) ((Optional) obj).map(new Function() { // from class: se0
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        return new ww(new te0(0, af0Var, (s50) obj2));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(cx.w);
            case 16:
                j81 j81Var = (j81) this.x;
                ExecutorService executorService = (ExecutorService) obj;
                c54 c54Var = j54.a;
                qw qwVar = (qw) j81Var.invoke(new hv0(executorService));
                l83 l83Var = new l83(executorService, i);
                qwVar.getClass();
                return new ax(qwVar, l83Var);
            case 17:
                ds2 ds2VarF = ((u63) this.x).a.f(j54.b);
                ds2VarF.getClass();
                return new cs2(new pr2(new zs2(ds2VarF), new m71(z2 ? 1 : 0)), new NFo7((t50) obj, 15));
            case 18:
                h81 h81Var = (h81) this.x;
                int i2 = lKy3.w;
                return h81Var.invoke();
            case 19:
                fl4 fl4VarB = ((yc3) this.x).a.b();
                jG$ jg_ = new jG$(8);
                fl4VarB.getClass();
                al4 al4Var = new al4(fl4VarB, jg_);
                final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final c54 c54Var2 = j54.c;
                final jl3 jl3Var = new jl3();
                i91 i91Var = new i91() { // from class: c14
                    public final /* synthetic */ int w = 1;
                    public final /* synthetic */ long y = 5000;

                    /* JADX WARN: Type inference failed for: r0v0, types: [k14] */
                    @Override // defpackage.i91
                    public final Object apply(Object obj2) {
                        final jl3 jl3Var2 = jl3Var;
                        final long j = this.y;
                        final TimeUnit timeUnit2 = timeUnit;
                        final c54 c54Var3 = c54Var2;
                        final AtomicInteger atomicInteger = new AtomicInteger();
                        final int i3 = this.w;
                        return new x11((a11) obj2, new pa3() { // from class: k14
                            @Override // defpackage.pa3
                            public final boolean test(Object obj3) {
                                return atomicInteger.getAndIncrement() != i3;
                            }
                        }).c(new i91() { // from class: l14
                            /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Throwable] */
                            @Override // defpackage.i91
                            public final Object apply(Object obj3) {
                                jl3Var2.w = (Throwable) obj3;
                                return a11.h(j * ((long) atomicInteger.get()), timeUnit2, c54Var3);
                            }
                        });
                    }
                };
                a11 a11VarD = al4Var instanceof n91 ? ((n91) al4Var).d() : new wl4(al4Var);
                a11VarD.getClass();
                return new pl4(new u11(new q11(a11VarD, i91Var)), new d14(jl3Var, i));
            case 20:
                Map map = (Map) this.x;
                f83 f83Var = ((y73) obj).a;
                Object obj2 = map.get(f83Var);
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new IllegalStateException(("Unknown PlayerStateValue " + f83Var).toString());
            case 21:
                return new no5((je4) this.x, (bs) obj);
            case 22:
                rIw9 riw9 = (rIw9) this.x;
                return zs.QnHx.a.c() > riw9.b + ((long) AdError.NETWORK_ERROR_CODE) ? so2.a : riw9.a;
            case 23:
                int iIntValue = ((Integer) obj).intValue();
                return Integer.valueOf(((Set) oe2.e.getValue()).contains(Integer.valueOf(iIntValue)) ? iIntValue : 0);
            case 24:
                ub4 ub4Var = (ub4) this.x;
                uy2 uy2Var2 = (uy2) obj;
                yb4 yb4Var2 = (yb4) uy2Var2.w;
                List<String> list = (List) uy2Var2.x;
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                for (String str4 : list) {
                    byte[] bArrX = OW8.x(yb4Var2).x();
                    int length = bArrX.length + 4;
                    byte[] bArr = new byte[length];
                    ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putInt(bArrX.length).put(bArrX);
                    arrayList.add(new DatagramPacket(bArr, length, InetAddress.getByName(str4), ub4Var.b.c));
                }
                return arrayList;
            case 25:
                ad2.CQf cQfW1 = ad2.w0();
                c33.CQf cQfT = c33.B.c();
                cQfT.A = ((b33) obj).a;
                cQfT.M();
                c33 c33VarQ = cQfT.f();
                if (!c33VarQ.isInitialized()) {
                    throw QnHx.AbstractC0099QnHx.C(c33VarQ);
                }
                cQfW1.O = c33VarQ;
                cQfW1.M();
                return cQfW1.build();
            case 26:
                h04 h04Var = (h04) obj;
                bs bsVar = ((ve4) this.x).l;
                return new bs(bsVar.w, bsVar.x, bsVar.y, h04Var, bsVar.A, bsVar.B);
            case 27:
                return nt4.c((nt4) this.x, ((Long) obj).longValue());
            default:
                return new nt4(((ot4) this.x).a, (Locale) obj);
        }
    }
}
