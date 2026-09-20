package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.services.core.log.DeviceLog;
import defpackage.eh1;
import defpackage.g44;
import defpackage.h44;
import defpackage.i44;
import defpackage.jh1;
import defpackage.s91;
import defpackage.t91;

/* JADX INFO: loaded from: classes3.dex */
public class ScarAdapterFactory {
    public static final int CODE_19_2 = 201604000;
    public static final int CODE_19_5 = 203404000;
    public static final int CODE_19_8 = 204890000;
    public static final int CODE_20_0 = 210402000;

    public jh1 createScarAdapter(long j, eh1 eh1Var) {
        if (j >= 210402000) {
            return new h44(eh1Var);
        }
        if (j >= 203404000 && j <= 204890000) {
            return new g44(eh1Var);
        }
        if (j >= 201604000) {
            return new i44(eh1Var);
        }
        String str = String.format("SCAR version %s is not supported.", Long.valueOf(j));
        eh1Var.handleError(new s91(t91.SCAR_UNSUPPORTED, str, new Object[0]));
        DeviceLog.debug(str);
        return null;
    }
}
