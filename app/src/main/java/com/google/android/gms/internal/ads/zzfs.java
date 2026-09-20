package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface zzfs extends zzev {
    public static final zzfsg zza = new zzfsg() { // from class: com.google.android.gms.internal.ads.zzfm
        @Override // com.google.android.gms.internal.ads.zzfsg
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String strZza = zzfrm.zza(str);
            if (TextUtils.isEmpty(strZza)) {
                return false;
            }
            return ((strZza.contains("text") && !strZza.contains("text/vtt")) || strZza.contains("html") || strZza.contains("xml")) ? false : true;
        }
    };

    Map zze();
}
