package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1139aA implements InterfaceC04136v {
    public final /* synthetic */ C1137a8 A00;

    public C1139aA(C1137a8 c1137a8) {
        this.A00 = c1137a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws Exception {
        if (this.A00.A00 == null) {
            return this.A00.A07(AnonymousClass76.A06);
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : this.A00.A00.getBondedDevices()) {
            arrayList.add(new C1138a9(bluetoothDevice));
        }
        return this.A00.A0D(arrayList);
    }
}
