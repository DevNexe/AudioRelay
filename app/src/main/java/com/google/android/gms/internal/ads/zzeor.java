package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeor implements zzeun {
    public final zzfyy a;
    public final zzfyy b;
    public final Context c;
    public final zzfdn d;
    public final ViewGroup e;

    public zzeor(zzfyy zzfyyVar, zzfyy zzfyyVar2, Context context, zzfdn zzfdnVar, ViewGroup viewGroup) {
        this.a = zzfyyVar;
        this.b = zzfyyVar2;
        this.c = context;
        this.d = zzfdnVar;
        this.e = viewGroup;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        View view = this.e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        zzbiy.zzc(this.c);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziz)).booleanValue()) {
            return this.b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeop
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeor zzeorVar = this.zza;
                    return new zzeos(zzeorVar.c, zzeorVar.d.zze, zzeorVar.a());
                }
            });
        }
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeor zzeorVar = this.zza;
                return new zzeos(zzeorVar.c, zzeorVar.d.zze, zzeorVar.a());
            }
        });
    }
}
