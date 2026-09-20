package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.zzeb;

/* JADX INFO: loaded from: classes3.dex */
public final class vf6 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final zzeb a;

    public vf6(zzeb zzebVar) {
        this.a = zzebVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        zzeb.a(this.a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
