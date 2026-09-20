package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegj implements zzbyu {
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public static zzfke a(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfke.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzfke.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzfke.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public static zzfkg b(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfkg.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfkg.UNSPECIFIED : zzfkg.ONE_PIXEL;
        }
        return zzfkg.DEFINED_BY_JAVASCRIPT;
    }

    public static zzfkh c(String str) {
        if ("native".equals(str)) {
            return zzfkh.NATIVE;
        }
        return "javascript".equals(str) ? zzfkh.JAVASCRIPT : zzfkh.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzbyw zzbywVar, zzbyv zzbyvVar, String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() || !zzfjx.zzb()) {
            return null;
        }
        zzfki zzfkiVarZza = zzfki.zza("Google", str);
        zzfkh zzfkhVarC = c("javascript");
        zzfke zzfkeVarA = a(zzbyvVar.toString());
        zzfkh zzfkhVar = zzfkh.NONE;
        if (zzfkhVarC == zzfkhVar) {
            zzcgn.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkeVarA == null) {
            zzcgn.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzbyvVar)));
            return null;
        }
        zzfkh zzfkhVarC2 = c(str4);
        if (zzfkeVarA == zzfke.VIDEO && zzfkhVarC2 == zzfkhVar) {
            zzcgn.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return new ObjectWrapper(zzfjz.zza(zzfka.zza(zzfkeVarA, b(zzbywVar.toString()), zzfkhVarC, zzfkhVarC2, true), zzfkb.zzb(zzfkiVarZza, webView, str5, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzbyw zzbywVar, zzbyv zzbyvVar, String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() || !zzfjx.zzb()) {
            return null;
        }
        zzfki zzfkiVarZza = zzfki.zza(str5, str);
        zzfkh zzfkhVarC = c("javascript");
        zzfkh zzfkhVarC2 = c(str4);
        zzfke zzfkeVarA = a(zzbyvVar.toString());
        zzfkh zzfkhVar = zzfkh.NONE;
        if (zzfkhVarC == zzfkhVar) {
            zzcgn.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkeVarA == null) {
            zzcgn.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzbyvVar)));
            return null;
        }
        if (zzfkeVarA == zzfke.VIDEO && zzfkhVarC2 == zzfkhVar) {
            zzcgn.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return new ObjectWrapper(zzfjz.zza(zzfka.zza(zzfkeVarA, b(zzbywVar.toString()), zzfkhVarC, zzfkhVarC2, true), zzfkb.zzc(zzfkiVarZza, webView, str6, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() && zzfjx.zzb()) {
            Object objM0 = ObjectWrapper.M0(iObjectWrapper);
            if (objM0 instanceof zzfjz) {
                ((zzfjz) objM0).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() && zzfjx.zzb()) {
            Object objM0 = ObjectWrapper.M0(iObjectWrapper);
            if (objM0 instanceof zzfjz) {
                ((zzfjz) objM0).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue()) {
            zzcgn.zzj("Omid flag is disabled");
            return false;
        }
        if (zzfjx.zzb()) {
            return true;
        }
        zzfjx.zza(context);
        return zzfjx.zzb();
    }
}
