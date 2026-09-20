package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdqm implements zzdow {
    public final zzbvu a;
    public final zzddq b;
    public final zzdcw c;
    public final zzdkj d;
    public final Context e;
    public final zzfcs f;
    public final zzcgt g;
    public final zzfdn h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public final zzbvq l;
    public final zzbvr m;

    public zzdqm(zzbvq zzbvqVar, zzbvr zzbvrVar, zzbvu zzbvuVar, zzddq zzddqVar, zzdcw zzdcwVar, zzdkj zzdkjVar, Context context, zzfcs zzfcsVar, zzcgt zzcgtVar, zzfdn zzfdnVar, byte[] bArr) {
        this.l = zzbvqVar;
        this.m = zzbvrVar;
        this.a = zzbvuVar;
        this.b = zzddqVar;
        this.c = zzdcwVar;
        this.d = zzdkjVar;
        this.e = context;
        this.f = zzfcsVar;
        this.g = zzcgtVar;
        this.h = zzfdnVar;
    }

    public static final HashMap b(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    public final void a(View view) {
        zzbvu zzbvuVar = this.a;
        zzdkj zzdkjVar = this.d;
        zzdcw zzdcwVar = this.c;
        if (zzbvuVar != null) {
            try {
                if (!zzbvuVar.zzA()) {
                    zzbvuVar.zzw(new ObjectWrapper(view));
                    zzdcwVar.onAdClicked();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
                        zzdkjVar.zzq();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to call handleClick", e);
                return;
            }
        }
        zzbvq zzbvqVar = this.l;
        if (zzbvqVar != null && !zzbvqVar.zzx()) {
            zzbvqVar.zzs(new ObjectWrapper(view));
            zzdcwVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
                zzdkjVar.zzq();
                return;
            }
            return;
        }
        zzbvr zzbvrVar = this.m;
        if (zzbvrVar == null || zzbvrVar.zzv()) {
            return;
        }
        zzbvrVar.zzq(new ObjectWrapper(view));
        zzdcwVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
            zzdkjVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final boolean zzA(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final JSONObject zzd(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final JSONObject zze(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzi(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        zzcgn.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        if (this.j && this.f.zzM) {
            return;
        }
        a(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzk(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzl(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzn(View view, Map map, Map map2, boolean z) {
        if (!this.j) {
            zzcgn.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f.zzM) {
            a(view);
        } else {
            zzcgn.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzp(View view, Map map, Map map2) {
        try {
            if (!this.i) {
                this.i = com.google.android.gms.ads.internal.zzt.zzt().zzn(this.e, this.g.zza, this.f.zzD.toString(), this.h.zzf);
            }
            if (this.k) {
                zzbvu zzbvuVar = this.a;
                zzddq zzddqVar = this.b;
                if (zzbvuVar != null && !zzbvuVar.zzB()) {
                    zzbvuVar.zzx();
                    zzddqVar.zza();
                    return;
                }
                zzbvq zzbvqVar = this.l;
                if (zzbvqVar != null && !zzbvqVar.zzy()) {
                    zzbvqVar.zzt();
                    zzddqVar.zza();
                    return;
                }
                zzbvr zzbvrVar = this.m;
                if (zzbvrVar == null || zzbvrVar.zzw()) {
                    return;
                }
                zzbvrVar.zzr();
                zzddqVar.zza();
            }
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzr(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzs(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzt(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzu() {
        this.j = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzv(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        zzcgn.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzw(zzbnu zzbnuVar) {
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: JSONException -> 0x0050, RemoteException -> 0x0126, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0050, blocks: (B:45:0x00b9, B:46:0x00ce, B:48:0x00d4), top: B:71:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ce A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzn;
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            JSONObject jSONObject = this.f.zzal;
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbq)).booleanValue();
            zzbvu zzbvuVar = this.a;
            zzbvr zzbvrVar = this.m;
            zzbvq zzbvqVar = this.l;
            boolean z = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbr)).booleanValue() && next.equals("3010")) {
                                Object objM0 = null;
                                if (zzbvuVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbvuVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (zzbvqVar != null) {
                                    iObjectWrapperZzn = zzbvqVar.zzk();
                                } else {
                                    iObjectWrapperZzn = zzbvrVar != null ? zzbvrVar.zzj() : null;
                                }
                                if (iObjectWrapperZzn != null) {
                                    objM0 = ObjectWrapper.M0(iObjectWrapperZzn);
                                }
                                if (objM0 != null) {
                                    cls = objM0.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzq();
                                    classLoader = this.e.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzq();
                                    classLoader = this.e.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.k = z;
            HashMap mapB = b(map);
            HashMap mapB2 = b(map2);
            if (zzbvuVar != null) {
                zzbvuVar.zzy(objectWrapper, new ObjectWrapper(mapB), new ObjectWrapper(mapB2));
                return;
            }
            if (zzbvqVar != null) {
                zzbvqVar.zzv(objectWrapper, new ObjectWrapper(mapB), new ObjectWrapper(mapB2));
                zzbvqVar.zzu(objectWrapper);
            } else if (zzbvrVar != null) {
                zzbvrVar.zzt(objectWrapper, new ObjectWrapper(mapB), new ObjectWrapper(mapB2));
                zzbvrVar.zzs(objectWrapper);
            }
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzy(View view, Map map) {
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            zzbvu zzbvuVar = this.a;
            if (zzbvuVar != null) {
                zzbvuVar.zzz(objectWrapper);
                return;
            }
            zzbvq zzbvqVar = this.l;
            if (zzbvqVar != null) {
                zzbvqVar.zzw(objectWrapper);
                return;
            }
            zzbvr zzbvrVar = this.m;
            if (zzbvrVar != null) {
                zzbvrVar.zzu(objectWrapper);
            }
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final boolean zzz() {
        return this.f.zzM;
    }
}
