package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzefh;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzfgs;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.yg6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yg6 implements zzfyk {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ zzefh x;

    public yg6(zzefh zzefhVar, boolean z) {
        this.x = zzefhVar;
        this.w = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzcgn.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        int i;
        zzbgi zzbgiVarZza;
        int i2;
        int i3;
        String str;
        zzbfj zzbfjVar;
        Bundle bundle = (Bundle) obj;
        zzefh zzefhVar = this.x;
        if (zzefhVar.a.zzP()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (true) {
                b = -1;
                i = 2;
                if (it.hasNext()) {
                    final zzbgy zzbgyVar = (zzbgy) zzefh.h.get(zzfdy.zza(zzfdy.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbgy.UNSPECIFIED);
                    zzbgiVarZza = zzbgp.zza();
                    i2 = bundle.getInt("cnt", -2);
                    i3 = bundle.getInt("gnt", 0);
                    if (i2 == -1) {
                        zzefhVar.g = 2;
                    } else {
                        zzefhVar.g = 1;
                        if (i2 != 0) {
                            zzbgiVarZza.zzb(2);
                        } else if (i2 != 1) {
                            zzbgiVarZza.zzb(1);
                        } else {
                            zzbgiVarZza.zzb(3);
                        }
                        switch (i3) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 3;
                                break;
                            case 13:
                                i = 5;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        zzbgiVarZza.zza(i);
                    }
                    final zzbgp zzbgpVar = (zzbgp) zzbgiVarZza.zzal();
                    final boolean z = this.w;
                    zzefhVar.b.zza(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzeff
                        @Override // com.google.android.gms.internal.ads.zzfgs
                        public final Object zza(Object obj3) {
                            yg6 yg6Var = this.zza;
                            boolean z2 = z;
                            ArrayList arrayList2 = arrayList;
                            zzbgp zzbgpVar2 = zzbgpVar;
                            zzbgy zzbgyVar2 = zzbgyVar;
                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                            if (yg6Var.x.a.zzP()) {
                                return null;
                            }
                            zzbgt zzbgtVarZzg = zzbgu.zzg();
                            zzbgtVarZzg.zza(arrayList2);
                            zzefh zzefhVar2 = yg6Var.x;
                            zzbgtVarZzg.zzi(Settings.Global.getInt(zzefhVar2.c.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1);
                            com.google.android.gms.ads.internal.util.zzaa zzaaVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
                            TelephonyManager telephonyManager = zzefhVar2.e;
                            Context context = zzefhVar2.c;
                            zzbgtVarZzg.zzj(zzaaVarZzr.zzh(context, telephonyManager));
                            zzeez zzeezVar = zzefhVar2.f;
                            zzbgtVarZzg.zzf(zzeezVar.zze());
                            zzbgtVarZzg.zze(zzeezVar.zzb());
                            zzbgtVarZzg.zzb(zzeezVar.zza());
                            zzbgtVarZzg.zzc(zzbgyVar2);
                            zzbgtVarZzg.zzd(zzbgpVar2);
                            zzbgtVarZzg.zzk(zzefhVar2.g);
                            zzbgtVarZzg.zzl(z2 ? 2 : 1);
                            zzbgtVarZzg.zzh(zzeezVar.zzd());
                            zzbgtVarZzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().b());
                            zzbgtVarZzg.zzm(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1);
                            byte[] bArrZzaw = ((zzbgu) zzbgtVarZzg.zzal()).zzaw();
                            zzefk.zzg(sQLiteDatabase, z2, true);
                            zzefk.zzd(sQLiteDatabase, zzeezVar.zzd(), bArrZzaw);
                            return null;
                        }
                    });
                    return;
                }
                str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            b = 0;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            b = 2;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            b = 3;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            b = 1;
                        }
                        break;
                }
                if (b != 0) {
                    zzbfjVar = zzbfj.BANNER;
                } else if (b != 1) {
                    zzbfjVar = zzbfj.INTERSTITIAL;
                } else if (b != 2) {
                    zzbfjVar = zzbfj.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzbfjVar = zzbfj.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzbfjVar = zzbfj.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzbfjVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (true) {
            b = -1;
            i = 2;
            if (it.hasNext()) {
                final zzbgy zzbgyVar2 = (zzbgy) zzefh.h.get(zzfdy.zza(zzfdy.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbgy.UNSPECIFIED);
                zzbgiVarZza = zzbgp.zza();
                i2 = bundle.getInt("cnt", -2);
                i3 = bundle.getInt("gnt", 0);
                if (i2 == -1) {
                    zzefhVar.g = 2;
                } else {
                    zzefhVar.g = 1;
                    if (i2 != 0) {
                        zzbgiVarZza.zzb(2);
                    } else if (i2 != 1) {
                        zzbgiVarZza.zzb(1);
                    } else {
                        zzbgiVarZza.zzb(3);
                    }
                    switch (i3) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 3;
                            break;
                        case 13:
                            i = 5;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    zzbgiVarZza.zza(i);
                }
                final zzbgp zzbgpVar2 = (zzbgp) zzbgiVarZza.zzal();
                final boolean z2 = this.w;
                zzefhVar.b.zza(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzeff
                    @Override // com.google.android.gms.internal.ads.zzfgs
                    public final Object zza(Object obj4) {
                        yg6 yg6Var = this.zza;
                        boolean z3 = z2;
                        ArrayList arrayList3 = arrayList;
                        zzbgp zzbgpVar3 = zzbgpVar2;
                        zzbgy zzbgyVar3 = zzbgyVar2;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                        if (yg6Var.x.a.zzP()) {
                            return null;
                        }
                        zzbgt zzbgtVarZzg = zzbgu.zzg();
                        zzbgtVarZzg.zza(arrayList3);
                        zzefh zzefhVar2 = yg6Var.x;
                        zzbgtVarZzg.zzi(Settings.Global.getInt(zzefhVar2.c.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1);
                        com.google.android.gms.ads.internal.util.zzaa zzaaVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
                        TelephonyManager telephonyManager = zzefhVar2.e;
                        Context context = zzefhVar2.c;
                        zzbgtVarZzg.zzj(zzaaVarZzr.zzh(context, telephonyManager));
                        zzeez zzeezVar = zzefhVar2.f;
                        zzbgtVarZzg.zzf(zzeezVar.zze());
                        zzbgtVarZzg.zze(zzeezVar.zzb());
                        zzbgtVarZzg.zzb(zzeezVar.zza());
                        zzbgtVarZzg.zzc(zzbgyVar3);
                        zzbgtVarZzg.zzd(zzbgpVar3);
                        zzbgtVarZzg.zzk(zzefhVar2.g);
                        zzbgtVarZzg.zzl(z3 ? 2 : 1);
                        zzbgtVarZzg.zzh(zzeezVar.zzd());
                        zzbgtVarZzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().b());
                        zzbgtVarZzg.zzm(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1);
                        byte[] bArrZzaw = ((zzbgu) zzbgtVarZzg.zzal()).zzaw();
                        zzefk.zzg(sQLiteDatabase, z3, true);
                        zzefk.zzd(sQLiteDatabase, zzeezVar.zzd(), bArrZzaw);
                        return null;
                    }
                });
                return;
            }
            str = (String) it.next();
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        b = 0;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        b = 2;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        b = 3;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        b = 1;
                    }
                    break;
            }
            if (b != 0) {
                zzbfjVar = zzbfj.BANNER;
            } else if (b != 1) {
                zzbfjVar = zzbfj.INTERSTITIAL;
            } else if (b != 2) {
                zzbfjVar = zzbfj.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzbfjVar = zzbfj.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzbfjVar = zzbfj.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzbfjVar);
        }
    }
}
