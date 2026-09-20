package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzfyy;
import defpackage.i5;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    public final Context a;
    public final zzeai b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public final int h;
    public PointF i;
    public PointF j;
    public final Handler k;
    public final zzar l;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.util.zzar] */
    public zzas(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // java.lang.Runnable
            public final void run() {
                zzas zzasVar = this.zza;
                zzasVar.g = 4;
                zzasVar.zzr();
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzu().zzb();
        this.k = com.google.android.gms.ads.internal.zzt.zzu().zza();
        this.b = com.google.android.gms.ads.internal.zzt.zzt().zza();
    }

    public static final int c(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int iC = c(arrayList, "None", true);
        final int iC2 = c(arrayList, "Shake", true);
        final int iC3 = c(arrayList, "Flick", true);
        int iOrdinal = this.b.zza().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iC : iC3;
        } else {
            i = iC2;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        AlertDialog.Builder builderZzG = zzs.zzG(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderZzG.setTitle("Setup gesture");
        builderZzG.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderZzG.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzr();
            }
        });
        builderZzG.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzas zzasVar = this.zza;
                AtomicInteger atomicInteger2 = atomicInteger;
                int i3 = i;
                int i4 = iC2;
                int i5 = iC3;
                zzasVar.getClass();
                if (atomicInteger2.get() != i3) {
                    int i6 = atomicInteger2.get();
                    zzeai zzeaiVar = zzasVar.b;
                    if (i6 == i4) {
                        zzeaiVar.zzj(zzeae.SHAKE);
                    } else if (atomicInteger2.get() == i5) {
                        zzeaiVar.zzj(zzeae.FLICK);
                    } else {
                        zzeaiVar.zzj(zzeae.NONE);
                    }
                }
                zzasVar.zzr();
            }
        });
        builderZzG.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzG.create().show();
    }

    public final boolean b(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.i.x - f);
        int i = this.h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f2) < ((float) i) && Math.abs(this.j.x - f3) < ((float) i) && Math.abs(this.j.y - f4) < ((float) i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return i5.b(sb, this.d, "}");
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        zzar zzarVar = this.l;
        Handler handler = this.k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(zzarVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdL)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !b(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (b(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            handler.removeCallbacks(zzarVar);
        }
    }

    public final void zzn(String str) {
        this.d = str;
    }

    public final void zzo(String str) {
        this.e = str;
    }

    public final void zzp(String str) {
        this.c = str;
    }

    public final void zzq(String str) {
        this.f = str;
    }

    public final void zzr() {
        Context context = this.a;
        try {
            if (!(context instanceof Activity)) {
                zzcgn.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzt().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iC = c(arrayList, "Ad information", true);
            final int iC2 = c(arrayList, str, true);
            final int iC3 = c(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue();
            final int iC4 = c(arrayList, "Open ad inspector", zBooleanValue);
            final int iC5 = c(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzt.zzq();
            AlertDialog.Builder builderZzG = zzs.zzG(context);
            builderZzG.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
                /* JADX WARN: Code duplicated, block: B:16:0x0081  */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final String strTrim;
                    final zzas zzasVar = this.zza;
                    int i2 = iC;
                    int i3 = iC2;
                    int i4 = iC3;
                    int i5 = iC4;
                    int i6 = iC5;
                    zzasVar.getClass();
                    if (i != i2) {
                        if (i == i3) {
                            zzcgn.zze("Debug mode [Creative Preview] selected.");
                            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzac
                                /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
                                /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
                                /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
                                /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
                                /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
                                /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
                                /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
                                /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z;
                                    zzas zzasVar2 = zzasVar;
                                    zzasVar2.getClass();
                                    zzaw zzawVarZzt = com.google.android.gms.ads.internal.zzt.zzt();
                                    Context context2 = zzasVar2.a;
                                    String str3 = zzasVar2.d;
                                    String str4 = zzasVar2.e;
                                    zzawVarZzt.getClass();
                                    String strB = zzaw.b(context2, zzawVarZzt.c(context2, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdN), str3, str4).toString(), str4);
                                    if (!TextUtils.isEmpty(strB)) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strB.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            zzawVarZzt.f = jSONObject.optString("status");
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
                                                boolean z2 = "0".equals(zzawVarZzt.f) || "2".equals(zzawVarZzt.f);
                                                zzawVarZzt.zzf(z2);
                                                com.google.android.gms.ads.internal.zzt.zzp().zzh().zzA(true != z2 ? "" : str3);
                                            }
                                            synchronized (zzawVarZzt.a) {
                                                zzawVarZzt.c = strOptString;
                                            }
                                            z = true;
                                        } catch (JSONException e) {
                                            zzcgn.zzk("Fail to get in app preview response json.", e);
                                            z = false;
                                        }
                                        if (!z) {
                                            zzaw.a("In-app preview failed to load because of a system error. Please try again later.", context2, true, true);
                                            return;
                                        }
                                        if ("2".equals(zzawVarZzt.f)) {
                                            zzcgn.zze("Creative is not pushed for this device.");
                                            zzaw.a("There was no creative pushed from DFP to the device.", context2, false, false);
                                        } else if ("1".equals(zzawVarZzt.f)) {
                                            zzcgn.zze("The app is not linked for creative preview.");
                                            zzawVarZzt.zzd(context2, str3, str4);
                                        } else if ("0".equals(zzawVarZzt.f)) {
                                            zzcgn.zze("Device is linked for in app preview.");
                                            zzaw.a("The device is successfully linked for creative preview.", context2, false, true);
                                        }
                                    }
                                    zzcgn.zze("Not linked for in app preview.");
                                    z = false;
                                    if (!z) {
                                        zzaw.a("In-app preview failed to load because of a system error. Please try again later.", context2, true, true);
                                        return;
                                    }
                                    if ("2".equals(zzawVarZzt.f)) {
                                        zzcgn.zze("Creative is not pushed for this device.");
                                        zzaw.a("There was no creative pushed from DFP to the device.", context2, false, false);
                                    } else if ("1".equals(zzawVarZzt.f)) {
                                        zzcgn.zze("The app is not linked for creative preview.");
                                        zzawVarZzt.zzd(context2, str3, str4);
                                    } else if ("0".equals(zzawVarZzt.f)) {
                                        zzcgn.zze("Device is linked for in app preview.");
                                        zzaw.a("The device is successfully linked for creative preview.", context2, false, true);
                                    }
                                }
                            });
                            return;
                        }
                        if (i == i4) {
                            zzcgn.zze("Debug mode [Troubleshooting] selected.");
                            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzas zzasVar2 = zzasVar;
                                    zzasVar2.getClass();
                                    zzaw zzawVarZzt = com.google.android.gms.ads.internal.zzt.zzt();
                                    String str3 = zzasVar2.d;
                                    String str4 = zzasVar2.e;
                                    String str5 = zzasVar2.f;
                                    boolean zZzm = zzawVarZzt.zzm();
                                    Context context2 = zzasVar2.a;
                                    zzawVarZzt.zzh(zzawVarZzt.zzj(context2, str3, str4));
                                    if (!zzawVarZzt.zzm()) {
                                        zzawVarZzt.zzd(context2, str3, str4);
                                        return;
                                    }
                                    if (!zZzm && !TextUtils.isEmpty(str5)) {
                                        zzawVarZzt.zze(context2, str4, str5, str3);
                                    }
                                    zzcgn.zze("Device is linked for debug signals.");
                                    zzaw.a("The device is successfully linked for troubleshooting.", context2, false, true);
                                }
                            });
                            return;
                        }
                        zzeai zzeaiVar = zzasVar.b;
                        if (i == i5) {
                            final zzfyy zzfyyVar = zzcha.zze;
                            zzfyy zzfyyVar2 = zzcha.zza;
                            if (zzeaiVar.zzm()) {
                                zzfyyVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzas zzasVar2 = zzasVar;
                                        zzasVar2.getClass();
                                        com.google.android.gms.ads.internal.zzt.zzt().zzc(zzasVar2.a);
                                    }
                                });
                                return;
                            } else {
                                zzfyyVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzao
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzas zzasVar2 = zzasVar;
                                        zzfyy zzfyyVar3 = zzfyyVar;
                                        zzasVar2.getClass();
                                        zzaw zzawVarZzt = com.google.android.gms.ads.internal.zzt.zzt();
                                        String str3 = zzasVar2.d;
                                        String str4 = zzasVar2.e;
                                        Context context2 = zzasVar2.a;
                                        if (zzawVarZzt.zzj(context2, str3, str4)) {
                                            zzfyyVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzas zzasVar3 = zzasVar2;
                                                    zzasVar3.getClass();
                                                    com.google.android.gms.ads.internal.zzt.zzt().zzc(zzasVar3.a);
                                                }
                                            });
                                        } else {
                                            com.google.android.gms.ads.internal.zzt.zzt().zzd(context2, zzasVar2.d, zzasVar2.e);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == i6) {
                            final zzfyy zzfyyVar3 = zzcha.zze;
                            zzfyy zzfyyVar4 = zzcha.zza;
                            if (zzeaiVar.zzm()) {
                                zzfyyVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzas zzasVar2 = zzasVar;
                                        zzasVar2.a(zzasVar2.a);
                                    }
                                });
                                return;
                            } else {
                                zzfyyVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzas zzasVar2 = zzasVar;
                                        zzfyy zzfyyVar5 = zzfyyVar3;
                                        zzasVar2.getClass();
                                        zzaw zzawVarZzt = com.google.android.gms.ads.internal.zzt.zzt();
                                        String str3 = zzasVar2.d;
                                        String str4 = zzasVar2.e;
                                        Context context2 = zzasVar2.a;
                                        if (zzawVarZzt.zzj(context2, str3, str4)) {
                                            zzfyyVar5.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzas zzasVar3 = zzasVar2;
                                                    zzasVar3.a(zzasVar3.a);
                                                }
                                            });
                                        } else {
                                            com.google.android.gms.ads.internal.zzt.zzt().zzd(context2, zzasVar2.d, zzasVar2.e);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzasVar.a;
                    if (!(context2 instanceof Activity)) {
                        zzcgn.zzi("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = zzasVar.c;
                    if (TextUtils.isEmpty(str3)) {
                        strTrim = "No debug information";
                    } else {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        com.google.android.gms.ads.internal.zzt.zzq();
                        Map mapZzL = zzs.zzL(uriBuild);
                        for (String str4 : mapZzL.keySet()) {
                            sb.append(str4);
                            sb.append(" = ");
                            sb.append((String) mapZzL.get(str4));
                            sb.append("\n\n");
                        }
                        strTrim = sb.toString().trim();
                        if (TextUtils.isEmpty(strTrim)) {
                            strTrim = "No debug information";
                        }
                    }
                    com.google.android.gms.ads.internal.zzt.zzq();
                    AlertDialog.Builder builderZzG2 = zzs.zzG(context2);
                    builderZzG2.setMessage(strTrim);
                    builderZzG2.setTitle("Ad Information");
                    builderZzG2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                            zzas zzasVar2 = zzasVar;
                            String str5 = strTrim;
                            zzasVar2.getClass();
                            com.google.android.gms.ads.internal.zzt.zzq();
                            zzs.zzJ(zzasVar2.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderZzG2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                        }
                    });
                    builderZzG2.create().show();
                }
            });
            builderZzG.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzas(Context context, String str) {
        this(context);
        this.c = str;
    }
}
