package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hc x;

    public /* synthetic */ cc(hc hcVar, int i) {
        this.w = i;
        this.x = hcVar;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        vq2 vq2VarS;
        int i = this.w;
        hc hcVar = this.x;
        switch (i) {
            case 0:
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) obj;
                int i2 = Build.VERSION.SDK_INT;
                qb qbVar = hcVar.c;
                if (i2 >= 31) {
                    vq2<sd5> vq2VarX = qbVar.b.x(sd5.a);
                    D d = new D(qbVar, 4);
                    vq2VarX.getClass();
                    vq2VarS = new cs2(new cs2(vq2VarX, d), new k71(5));
                } else {
                    qbVar.getClass();
                    vq2VarS = vq2.s(new m03(true));
                }
                return vq2VarS.B(new ec(hcVar, bluetoothAdapter, 0));
            default:
                vq2<sd5> vq2VarX2 = hcVar.j.x(sd5.a);
                D d2 = new D((BluetoothHeadset) obj, 6);
                vq2VarX2.getClass();
                return new cs2(vq2VarX2, d2);
        }
    }
}
