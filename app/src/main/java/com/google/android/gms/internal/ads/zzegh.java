package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dh6;
import defpackage.xp2;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegh extends zzbyp {
    public final zzfhz A;
    public final Context w;
    public final zzdxo x;
    public final zzcgs y;
    public final zzefz z;

    public zzegh(Context context, zzefz zzefzVar, zzcgs zzcgsVar, zzdxo zzdxoVar, zzfhz zzfhzVar) {
        this.w = context;
        this.x = zzdxoVar;
        this.y = zzcgsVar;
        this.z = zzefzVar;
        this.A = zzfhzVar;
    }

    public static void zzc(Context context, zzdxo zzdxoVar, zzfhz zzfhzVar, zzefz zzefzVar, String str, String str2) {
        zzd(context, zzdxoVar, zzfhzVar, zzefzVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdxo zzdxoVar, zzfhz zzfhzVar, zzefz zzefzVar, String str, String str2, Map map) {
        String strZzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
            zzfhy zzfhyVarZzb = zzfhy.zzb(str2);
            zzfhyVarZzb.zza("gqi", str);
            zzfhyVarZzb.zza("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzp().zzv(context) ? "online" : "offline");
            zzfhyVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
            for (Map.Entry entry : map.entrySet()) {
                zzfhyVarZzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            strZzf = zzfhzVar.zza(zzfhyVarZzb);
        } else {
            zzdxn zzdxnVarZza = zzdxoVar.zza();
            zzdxnVarZza.zzb("gqi", str);
            zzdxnVarZza.zzb("action", str2);
            zzdxnVarZza.zzb("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzp().zzv(context) ? "online" : "offline");
            zzdxnVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
            for (Map.Entry entry2 : map.entrySet()) {
                zzdxnVarZza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            strZzf = zzdxnVarZza.zzf();
        }
        zzefzVar.zzd(new zzegb(com.google.android.gms.ads.internal.zzt.zzB().b(), str, strZzf, 2));
    }

    public static void zzh(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final zzbr zzbrVar, final zzefz zzefzVar, final zzdxo zzdxoVar, final zzfhz zzfhzVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzq();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        final Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzp().zzd();
        builderZzG.setTitle(resourcesZzd == null ? "Open ad when you're back online." : resourcesZzd.getString(R.string.offline_opt_in_title)).setMessage(resourcesZzd == null ? "We'll send you a notification with a link to the advertiser site." : resourcesZzd.getString(R.string.offline_opt_in_message)).setPositiveButton(resourcesZzd == null ? "OK" : resourcesZzd.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzdxo zzdxoVar2 = zzdxoVar;
                Activity activity2 = activity;
                zzfhz zzfhzVar2 = zzfhzVar;
                zzefz zzefzVar2 = zzefzVar;
                String str3 = str;
                zzbr zzbrVar2 = zzbrVar;
                String str4 = str2;
                Resources resources = resourcesZzd;
                final com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                if (zzdxoVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    zzegh.zzd(activity2, zzdxoVar2, zzfhzVar2, zzefzVar2, str3, "dialog_click", map);
                }
                try {
                    if (!zzbrVar2.zzf(new ObjectWrapper(activity2), str4, str3)) {
                        zzefzVar2.zzc(str3);
                        if (zzdxoVar2 != null) {
                            zzegh.zzc(activity2, zzdxoVar2, zzfhzVar2, zzefzVar2, str3, "offline_notification_worker_not_scheduled");
                        }
                    }
                } catch (RemoteException e) {
                    zzcgn.zzh("Failed to schedule offline notification poster.", e);
                }
                com.google.android.gms.ads.internal.zzt.zzq();
                AlertDialog.Builder builderZzG2 = com.google.android.gms.ads.internal.util.zzs.zzG(activity2);
                builderZzG2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegc
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zzl zzlVar3 = zzlVar2;
                        if (zzlVar3 != null) {
                            zzlVar3.zzb();
                        }
                    }
                });
                AlertDialog alertDialogCreate = builderZzG2.create();
                alertDialogCreate.show();
                Timer timer = new Timer();
                timer.schedule(new dh6(alertDialogCreate, timer, zzlVar2), 3000L);
            }
        }).setNegativeButton(resourcesZzd == null ? "No thanks" : resourcesZzd.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzege
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzefz zzefzVar2 = zzefzVar;
                String str3 = str;
                zzdxo zzdxoVar2 = zzdxoVar;
                Activity activity2 = activity;
                zzfhz zzfhzVar2 = zzfhzVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzefzVar2.zzc(str3);
                if (zzdxoVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzegh.zzd(activity2, zzdxoVar2, zzfhzVar2, zzefzVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzefz zzefzVar2 = zzefzVar;
                String str3 = str;
                zzdxo zzdxoVar2 = zzdxoVar;
                Activity activity2 = activity;
                zzfhz zzfhzVar2 = zzfhzVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzefzVar2.zzc(str3);
                if (zzdxoVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzegh.zzd(activity2, zzdxoVar2, zzfhzVar2, zzefzVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builderZzG.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(Intent intent) {
        char c;
        zzefz zzefzVar = this.z;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            zzcfw zzcfwVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
            Context context = this.w;
            boolean zZzv = zzcfwVarZzp.zzv(context);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                char c2 = true != zZzv ? (char) 2 : (char) 1;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
                c = c2;
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
                c = 2;
            }
            zzd(this.w, this.x, this.A, this.z, stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = zzefzVar.getWritableDatabase();
                if (c == 1) {
                    zzefzVar.x.execute(new zzeft(writableDatabase, stringExtra2, this.y));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e) {
                zzcgn.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf() {
        final zzcgs zzcgsVar = this.y;
        this.z.b(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                zzefz.c((SQLiteDatabase) obj, zzcgsVar);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzr().zzg(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = zzfpl.zza | 1073741824;
        PendingIntent pendingIntentZza = zzfpl.zza(context, 0, intent, i, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent pendingIntentZza2 = zzfpl.zza(context, 0, intent2, i, 0);
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzp().zzd();
        xp2 xp2Var = new xp2(context, "offline_notification_channel");
        xp2Var.e = xp2.b(resourcesZzd == null ? "View the ad you saved when you were offline" : resourcesZzd.getString(R.string.offline_notification_title));
        xp2Var.f = xp2.b(resourcesZzd == null ? "Tap to open ad" : resourcesZzd.getString(R.string.offline_notification_text));
        xp2Var.c(16, true);
        Notification notification = xp2Var.s;
        notification.deleteIntent = pendingIntentZza2;
        xp2Var.g = pendingIntentZza;
        notification.icon = context.getApplicationInfo().icon;
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, xp2Var.a());
        zzd(this.w, this.x, this.A, this.z, str2, "offline_notification_impression", new HashMap());
    }
}
