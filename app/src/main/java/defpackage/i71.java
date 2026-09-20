package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i71 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ i71(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = 6;
        int i2 = 0;
        int i3 = 1;
        switch (this.w) {
            case 0:
                o71 o71Var = (o71) this.x;
                c54 c54Var = (c54) this.y;
                if (!((Boolean) obj).booleanValue()) {
                    return or2.w;
                }
                vk4<x61> vk4VarG = o71Var.b.g();
                vk4VarG.getClass();
                if (c54Var != null) {
                    return new cs2(new hl4(new tl4(vk4VarG, c54Var), new j71(i2, o71Var, c54Var)), new k71(i2)).B(new NFo7(o71Var, i3));
                }
                throw new NullPointerException("scheduler is null");
            case 1:
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.x;
                hc hcVar = (hc) this.y;
                if (!bluetoothAdapter.isEnabled()) {
                    a62.a.e("bluetooth_disabled");
                    return vq2.s(jc.F1.a);
                }
                a62.a.e("bluetooth_enabled");
                jl3 jl3Var = new jl3();
                ic icVar = new ic(jl3Var, hcVar, bluetoothAdapter);
                fc fcVar = new fc(i2, hcVar, bluetoothAdapter);
                rg3<yb> rg3Var = hcVar.k;
                rg3Var.getClass();
                vq2 vq2VarB = new ir2(new jr2(new kr2(rg3Var, fcVar), new nm3(i3, icVar, jl3Var), m91.d, m91.c), new xW8n(icVar, 1)).B(new ec(hcVar, bluetoothAdapter, i3)).B(new cc(hcVar, i3));
                Ot0r ot0r = new Ot0r(hcVar, i);
                vq2VarB.getClass();
                return new cs2(vq2VarB, ot0r).B(new NFo7(hcVar, 7));
            case 2:
                return new yk4(new v9L((n60) this.x, (mn2) this.y, (bs) obj, i3));
            case 3:
                wd2 wd2Var = (wd2) this.x;
                c54 c54Var2 = (c54) this.y;
                ud2 ud2Var = wd2Var.b;
                ud2Var.getClass();
                NUlFixed nUlA = AY.a(Integer.MAX_VALUE, null, 6);
                ud2Var.a.setValue(new mq4(nUlA));
                return new dr2(new ke5(c54Var2 instanceof ol0 ? ((ol0) c54Var2).b : new h54(c54Var2), new vz0(new ko(nUlA, true), new td2(ud2Var, null))));
            case 4:
                c54 c54Var3 = (c54) this.y;
                List list = (List) obj;
                if (list.isEmpty()) {
                    return vq2.s(cs0.w);
                }
                List<je4> list2 = list;
                ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
                for (je4 je4Var : list2) {
                    ds2 ds2VarD = je4Var.d(c54Var3);
                    D d = new D(je4Var, 21);
                    ds2VarD.getClass();
                    arrayList.add(new cs2(ds2VarD, d));
                }
                return vq2.l(arrayList, new k71(20));
            case 5:
                lfe lfeVar = (lfe) this.x;
                di diVar = (di) obj;
                return new ey(new Q(i3, lfeVar, diVar), new hMT(lfeVar, lfeVar.f.invoke(diVar), diVar, (j81) this.y, 0), new sn2(3));
            case 6:
                List list3 = (List) obj;
                return list3.isEmpty() ? cx.w : vq2.r(2000L, 2000L, TimeUnit.MILLISECONDS, j54.b).x(0L).u(j54.c).o(new sf0((ub4) this.x, (DatagramSocket) this.y, list3, i3));
            default:
                nt4 nt4Var = (nt4) obj;
                List<jg4> list4 = ((jc4.CQf) this.y).a;
                int iA = C0239D.A(mu.w0(list4, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (jg4 jg4Var : list4) {
                    of4 id = jg4Var.a.getId();
                    long jC = jg4Var.b - zs.QnHx.a.c();
                    long jG = gq0.g(hx3.b);
                    if (jC < jG) {
                        jC = jG;
                    }
                    float f = 100;
                    linkedHashMap.put(id, new gl0(((float) Math.rint(((gq0.g(jg4Var.c) - jC) / gq0.g(jg4Var.c)) * f)) / f, nt4.c(nt4Var, jC)));
                }
                return linkedHashMap;
        }
    }
}
