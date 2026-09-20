package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hc x;
    public final /* synthetic */ BluetoothAdapter y;

    public /* synthetic */ ec(hc hcVar, BluetoothAdapter bluetoothAdapter, int i) {
        this.w = i;
        this.x = hcVar;
        this.y = bluetoothAdapter;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        BluetoothAdapter bluetoothAdapter = this.y;
        hc hcVar = this.x;
        switch (i) {
            case 0:
                return ((m03) obj).a ? hcVar.i.x(sd5.a).B(new i71(1, bluetoothAdapter, hcVar)) : vq2.s(jc.NUlFixed.a);
            default:
                yb ybVar = (yb) obj;
                if (ybVar instanceof yb.QnHx) {
                    return vq2.s(((yb.QnHx) ybVar).a);
                }
                if (ur1.a(ybVar, yb.CQf.a)) {
                    return new jr2(vq2.D(10L, TimeUnit.SECONDS), new gc(0, hcVar, bluetoothAdapter), m91.d, m91.c).n(new KnU(7));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
