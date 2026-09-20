package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfem {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzego) {
            zzego zzegoVar = (zzego) th;
            return zzc(zzegoVar.zza(), zzegoVar.zzb());
        }
        if (th instanceof zzeas) {
            return th.getMessage() == null ? zzd(((zzeas) th).zza(), null, null) : zzd(((zzeas) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzay)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
        return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfsu.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzegp zzegpVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zza(th);
        int i = zzeVarZza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarZza.zzd = null;
        }
        if (zzegpVar != null) {
            zzeVarZza.zze = zzegpVar.zzb();
        }
        return zzeVarZza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgZ)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return zzd(i, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i, String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str2;
        String str3;
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 1:
                    str = "Invalid request.";
                    str2 = str;
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    str2 = str;
                    break;
                case 4:
                    str = "Network error.";
                    str2 = str;
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    str2 = str;
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    str2 = str;
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    str2 = str;
                    break;
                case 8:
                    str = "The ad is not ready.";
                    str2 = str;
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    str2 = str;
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    str2 = str;
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    str2 = str;
                    break;
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhc)).intValue() > 0) {
                        str2 = "No fill.";
                    } else {
                        str = "The mediation adapter did not return an ad.";
                        str2 = str;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    str2 = str;
                    break;
                case 14:
                    str = "Invalid ad string.";
                    str2 = str;
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    str2 = str;
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    str2 = str;
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    str2 = str;
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    str2 = str;
                    break;
            }
        } else {
            str2 = str;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i4 = 0;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i4 = 1;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i4 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i4 = 8;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                i4 = 2;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i4 = 4;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhc)).intValue() <= 0) {
                    i4 = 9;
                } else {
                    i4 = 3;
                }
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i4 = 10;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i4 = 11;
                return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i) {
                    case 1:
                        str3 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str3 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str3 = "NO_FILL";
                        break;
                    case 4:
                        str3 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str3 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str3 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str3 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str3 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str3 = "NOT_READY";
                        break;
                    case 10:
                        str3 = "AD_REUSED";
                        break;
                    case 11:
                        str3 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str3 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str3 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str3 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str3 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str3 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str3));
        }
    }
}
