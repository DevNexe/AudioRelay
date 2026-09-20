package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefr {
    public final zzbel a;
    public final Context b;
    public final zzeev c;
    public final zzcgt d;
    public final String e;
    public final zzfhz f;
    public final zzg g = com.google.android.gms.ads.internal.zzt.zzp().zzh();

    public zzefr(Context context, zzcgt zzcgtVar, zzbel zzbelVar, zzeev zzeevVar, String str, zzfhz zzfhzVar) {
        this.b = context;
        this.d = zzcgtVar;
        this.a = zzbelVar;
        this.c = zzeevVar;
        this.e = str;
        this.f = zzfhzVar;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jZze = 0;
        for (int i = 0; i < size; i++) {
            zzbgu zzbguVar = (zzbgu) arrayList.get(i);
            if (zzbguVar.zzw() == 2 && zzbguVar.zze() > jZze) {
                jZze = zzbguVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.c.zza(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefn
                @Override // com.google.android.gms.internal.ads.zzfgs
                public final Object zza(Object obj) {
                    zzefr zzefrVar = this.zza;
                    boolean z2 = z;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    Context context = zzefrVar.b;
                    if (z2) {
                        context.deleteDatabase("OfflineUpload.db");
                        return null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                        zzfhy zzfhyVarZzb = zzfhy.zzb("oa_upload");
                        zzfhyVarZzb.zza("oa_failed_reqs", String.valueOf(zzefk.zza(sQLiteDatabase, 0)));
                        zzfhyVarZzb.zza("oa_total_reqs", String.valueOf(zzefk.zza(sQLiteDatabase, 1)));
                        zzfhyVarZzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
                        zzfhyVarZzb.zza("oa_last_successful_time", String.valueOf(zzefk.zzb(sQLiteDatabase, 2)));
                        zzg zzgVar = zzefrVar.g;
                        boolean zZzP = zzgVar.zzP();
                        String str = zzefrVar.e;
                        zzfhyVarZzb.zza("oa_session_id", zZzP ? "" : str);
                        zzfhz zzfhzVar = zzefrVar.f;
                        zzfhzVar.zzb(zzfhyVarZzb);
                        ArrayList arrayListZzc = zzefk.zzc(sQLiteDatabase);
                        zzefr.a(sQLiteDatabase, arrayListZzc);
                        int size = arrayListZzc.size();
                        for (int i = 0; i < size; i++) {
                            zzbgu zzbguVar = (zzbgu) arrayListZzc.get(i);
                            zzfhy zzfhyVarZzb2 = zzfhy.zzb("oa_signals");
                            zzfhyVarZzb2.zza("oa_session_id", zzgVar.zzP() ? "" : str);
                            zzbgp zzbgpVarZzf = zzbguVar.zzf();
                            String strValueOf = zzbgpVarZzf.zzf() ? String.valueOf(zzbgpVarZzf.zzh() - 1) : "-1";
                            String string = zzfvj.zzb(zzbguVar.zzk(), new zzfru() { // from class: com.google.android.gms.internal.ads.zzefq
                                @Override // com.google.android.gms.internal.ads.zzfru
                                public final Object apply(Object obj2) {
                                    return ((zzbfj) obj2).name();
                                }
                            }).toString();
                            zzfhyVarZzb2.zza("oa_sig_ts", String.valueOf(zzbguVar.zze()));
                            zzfhyVarZzb2.zza("oa_sig_status", String.valueOf(zzbguVar.zzw() - 1));
                            zzfhyVarZzb2.zza("oa_sig_resp_lat", String.valueOf(zzbguVar.zzd()));
                            zzfhyVarZzb2.zza("oa_sig_render_lat", String.valueOf(zzbguVar.zzc()));
                            zzfhyVarZzb2.zza("oa_sig_formats", string);
                            zzfhyVarZzb2.zza("oa_sig_nw_type", strValueOf);
                            zzfhyVarZzb2.zza("oa_sig_wifi", String.valueOf(zzbguVar.zzx() - 1));
                            zzfhyVarZzb2.zza("oa_sig_airplane", String.valueOf(zzbguVar.zzt() - 1));
                            zzfhyVarZzb2.zza("oa_sig_data", String.valueOf(zzbguVar.zzu() - 1));
                            zzfhyVarZzb2.zza("oa_sig_nw_resp", String.valueOf(zzbguVar.zza()));
                            zzfhyVarZzb2.zza("oa_sig_offline", String.valueOf(zzbguVar.zzv() - 1));
                            zzfhyVarZzb2.zza("oa_sig_nw_state", String.valueOf(zzbguVar.zzj().zza()));
                            if (zzbgpVarZzf.zze() && zzbgpVarZzf.zzf() && zzbgpVarZzf.zzh() == 2) {
                                zzfhyVarZzb2.zza("oa_sig_cell_type", String.valueOf(zzbgpVarZzf.zzg() - 1));
                            }
                            zzfhzVar.zzb(zzfhyVarZzb2);
                        }
                    } else {
                        ArrayList arrayListZzc2 = zzefk.zzc(sQLiteDatabase);
                        zzbgv zzbgvVarZza = zzbgz.zza();
                        zzbgvVarZza.zzb(context.getPackageName());
                        zzbgvVarZza.zzd(Build.MODEL);
                        zzbgvVarZza.zze(zzefk.zza(sQLiteDatabase, 0));
                        zzbgvVarZza.zza(arrayListZzc2);
                        zzbgvVarZza.zzg(zzefk.zza(sQLiteDatabase, 1));
                        zzbgvVarZza.zzc(zzefk.zza(sQLiteDatabase, 3));
                        zzbgvVarZza.zzh(com.google.android.gms.ads.internal.zzt.zzB().b());
                        zzbgvVarZza.zzf(zzefk.zzb(sQLiteDatabase, 2));
                        final zzbgz zzbgzVar = (zzbgz) zzbgvVarZza.zzal();
                        zzefr.a(sQLiteDatabase, arrayListZzc2);
                        zzbek zzbekVar = new zzbek() { // from class: com.google.android.gms.internal.ads.zzefo
                            @Override // com.google.android.gms.internal.ads.zzbek
                            public final void zza(zzbga zzbgaVar) {
                                zzbgaVar.zzi(zzbgzVar);
                            }
                        };
                        zzbel zzbelVar = zzefrVar.a;
                        zzbelVar.zzb(zzbekVar);
                        zzbhk zzbhkVarZza = zzbhl.zza();
                        zzcgt zzcgtVar = zzefrVar.d;
                        zzbhkVarZza.zza(zzcgtVar.zzb);
                        zzbhkVarZza.zzc(zzcgtVar.zzc);
                        zzbhkVarZza.zzb(true != zzcgtVar.zzd ? 2 : 0);
                        final zzbhl zzbhlVar = (zzbhl) zzbhkVarZza.zzal();
                        zzbelVar.zzb(new zzbek() { // from class: com.google.android.gms.internal.ads.zzefp
                            @Override // com.google.android.gms.internal.ads.zzbek
                            public final void zza(zzbga zzbgaVar) {
                                zzbhl zzbhlVar2 = zzbhlVar;
                                zzbfs zzbfsVar = (zzbfs) zzbgaVar.zzb().zzaz();
                                zzbfsVar.zzb(zzbhlVar2);
                                zzbgaVar.zzg(zzbfsVar);
                            }
                        });
                        zzbelVar.zzc(10004);
                    }
                    zzefk.zzf(sQLiteDatabase);
                    return null;
                }
            });
        } catch (Exception e) {
            zzcgn.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
