package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqm extends zzarm {
    public zzaqm(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "kypbHNkssvP0JsUhutxcI0i2X1rFBFEIMdtXVFZfH9yzsagSauN+Hc+hylkiTIg3", "RsQqTTopQSSPcEVMkYGLNYEBC1gHD99rtwIfq5A0FgY=", zzamhVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() throws InvocationTargetException {
        zzamh zzamhVar = this.z;
        zzamhVar.zzZ(3);
        try {
            int i = 1;
            if (true == ((Boolean) this.A.invoke(null, this.w.zzb())).booleanValue()) {
                i = 2;
            }
            zzamhVar.zzZ(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
