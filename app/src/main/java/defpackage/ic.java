package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;

/* JADX INFO: loaded from: classes.dex */
public final class ic extends cx1 implements h81<BluetoothHeadset> {
    public final /* synthetic */ jl3<BluetoothHeadset> w;
    public final /* synthetic */ hc x;
    public final /* synthetic */ BluetoothAdapter y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jl3<BluetoothHeadset> jl3Var, hc hcVar, BluetoothAdapter bluetoothAdapter) {
        super(0);
        this.w = jl3Var;
        this.x = hcVar;
        this.y = bluetoothAdapter;
    }

    @Override // defpackage.h81
    public final BluetoothHeadset invoke() {
        BluetoothHeadset bluetoothHeadset = this.w.w;
        if (bluetoothHeadset == null) {
            return null;
        }
        this.x.getClass();
        a62 a62Var = a62.a;
        this.y.closeProfileProxy(1, bluetoothHeadset);
        return bluetoothHeadset;
    }
}
