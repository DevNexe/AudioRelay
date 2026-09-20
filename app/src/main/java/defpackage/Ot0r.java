package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import com.azefsw.audioconnect.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Ot0r implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ Ot0r(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        m91.T23 t23 = m91.c;
        m91.byN byn = m91.d;
        int i2 = 12;
        int i3 = 3;
        int i4 = 0;
        int i5 = 4;
        int i6 = 1;
        switch (i) {
            case 0:
                EWe eWe = (EWe) this.x;
                fm3 fm3Var = eWe.c;
                return new zk4(new il4(new QE((Boolean) obj, i4)), new gl4(vk4.k(fm3Var.p(), fm3Var.s(), ym.G).g(j54.b), new NFo7(eWe, i4)));
            case 1:
                nq1 nq1Var = (nq1) this.x;
                if (!((Boolean) ((uy2) obj).w).booleanValue()) {
                    nq1Var.a.stop();
                    return or2.w;
                }
                us2 us2VarN = nq1Var.e.g().j().n(new KnU(i5));
                Acr acr = new Acr(2);
                us2VarN.getClass();
                return new at2(new cs2(us2VarN, acr), FWT.I(nq1Var.d, j54.b));
            case 2:
                return ((Dz) this.x).a.f();
            case 3:
                P_xB p_xB = (P_xB) this.x;
                if (((Boolean) obj).booleanValue()) {
                    return vq2.s(Boolean.FALSE);
                }
                us2 us2VarJ = new kl4(((EWe) p_xB.x).a(), new Acr(i5)).j();
                jG$ jg_ = new jG$(i6);
                us2VarJ.getClass();
                jr2 jr2Var = new jr2(us2VarJ, byn, jg_, t23);
                Boolean bool = Boolean.FALSE;
                if (bool != null) {
                    return new es2(jr2Var, new m91.PRnFixed(bool));
                }
                throw new NullPointerException("item is null");
            case 4:
                gy0 gy0Var = (gy0) this.x;
                cy0 cy0Var = (cy0) obj;
                gy0Var.getClass();
                return gy0.a(cy0Var) ? vk4.f(cy0Var) : gy0Var.a;
            case 5:
                String str = (String) obj;
                return iv4.s(str) ? ((po1K) this.x).x.b() : str;
            case 6:
                BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) obj;
                int size = bluetoothHeadset.getConnectedDevices().size();
                a62.a.j("bluetooth", size != 0 ? size != 1 ? "multiple_bluetooth_devices" : "one_bluetooth_device" : "no_bluetooth_device");
                for (BluetoothDevice bluetoothDevice : bluetoothHeadset.getConnectedDevices()) {
                    if (bluetoothHeadset.isAudioConnected(bluetoothDevice)) {
                        return new kk0.QnHx(bluetoothDevice.getName());
                    }
                }
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) wu.J0(bluetoothHeadset.getConnectedDevices());
                return bluetoothDevice2 != null ? new kk0.CQf(bluetoothDevice2.getName()) : kk0.F1.a;
            case 7:
                ds2 ds2VarF = ((un2) this.x).a.f(j54.b);
                ds2VarF.getClass();
                return new cs2(new pr2(new cs2(new zs2(ds2VarF), new k71(7)), new tn2(0)), new D((zt4) obj, 8));
            case 8:
                return ((Boolean) obj).booleanValue() ? new ox(new uw(new im3((ap2) this.x, i3)).c(new jG$(i5))) : cx.w;
            case 9:
                return kd.x(new vk5((wk5) this.x, (ok5) obj, null));
            case 10:
                return kd.x(new ls((ms) this.x, (ad2) obj, null));
            case 11:
                ec4 ec4Var = (ec4) this.x;
                yb4 yb4Var = (yb4) obj;
                vq2<h04> vq2VarX = ec4Var.c.x(yb4Var.z);
                D d = new D(yb4Var, i2);
                vq2VarX.getClass();
                cs2 cs2Var = new cs2(vq2VarX, d);
                int i7 = 5;
                return new jr2(new jr2(cs2Var, new jG$(i7), byn, t23), new J(ec4Var, i7), byn, t23);
            case 12:
                C0w c0w = (C0w) this.x;
                if (!((Boolean) obj).booleanValue()) {
                    return vq2.s(Boolean.FALSE);
                }
                lKy3 lky3 = c0w.b;
                lky3.getClass();
                return new cs2(lky3.j(lky3.d(R.string.pref_audio_output_dismissed_shortcut_key), null, new IU(lky3)), new KnU(13));
            case 13:
                dd3 dd3Var = (dd3) this.x;
                int i8 = ek0.a;
                return dd3Var;
            case 14:
                wf3 wf3VarH = FWT.H((h04) obj);
                ad2.CQf cQfW0 = ad2.w0();
                xf3.CQf cQfU = xf3.B.c();
                cQfU.A = wf3VarH;
                cQfU.M();
                cQfW0.S = cQfU.build();
                cQfW0.M();
                return cQfW0.build();
            case 15:
                v1 v1Var = (v1) this.x;
                List<jg4> list = (List) obj;
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                for (jg4 jg4Var : list) {
                    long jC = jg4Var.b - zs.QnHx.a.c();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c54 c54Var = j54.b;
                    if (timeUnit == null) {
                        throw new NullPointerException("unit is null");
                    }
                    if (c54Var == null) {
                        throw new NullPointerException("scheduler is null");
                    }
                    arrayList.add(new rw(new wx(jC, timeUnit, c54Var), new fx(new pq1(i3, v1Var, jg4Var))));
                }
                return qw.e(arrayList);
            case 16:
                vq2 vq2Var = (vq2) this.x;
                if (!((Boolean) obj).booleanValue()) {
                    return vq2.s(cs0.w);
                }
                final long jC2 = zs.QnHx.a.c();
                i91 i91Var = new i91() { // from class: uh2
                    @Override // defpackage.i91
                    public final Object apply(Object obj2) {
                        int i9 = th2.b;
                        List<je4> listE0 = wu.E0(wu.Z0((List) obj2, new sh2()));
                        ArrayList arrayList2 = new ArrayList(mu.w0(listE0, 10));
                        for (je4 je4Var : listE0) {
                            long j = th2.a;
                            arrayList2.add(new jg4(je4Var, gq0.g(j) + jC2, j, el0.F1.NEED_PREMIUM_FOR_MULTI));
                        }
                        return arrayList2;
                    }
                };
                vq2Var.getClass();
                return new cs2(vq2Var, i91Var);
            case 17:
                return vq2.E(500L, TimeUnit.MILLISECONDS, (c54) this.x);
            case 18:
                d33 d33Var = (d33) obj;
                return new rf4(d33Var.a, zs.QnHx.a.c() - d33Var.b);
            case 19:
                return new jr2(vq2.D(1000L, TimeUnit.MILLISECONDS), new J((se4) this.x, i2), byn, t23);
            case 20:
                return Long.valueOf(zs.QnHx.a.c() - ((il3) this.x).w);
            case 21:
                return (ps) this.x;
            default:
                return ((sAn) this.x).b;
        }
    }
}
