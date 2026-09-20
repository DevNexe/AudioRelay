package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflj {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final WeakHashMap h = new WeakHashMap();
    public boolean i;

    public final View zza(String str) {
        return (View) this.c.get(str);
    }

    public final zzfli zzb(View view) {
        HashMap map = this.b;
        zzfli zzfliVar = (zzfli) map.get(view);
        if (zzfliVar != null) {
            map.remove(view);
        }
        return zzfliVar;
    }

    public final String zzc(String str) {
        return (String) this.g.get(str);
    }

    public final String zzd(View view) {
        HashMap map = this.a;
        if (map.size() == 0) {
            return null;
        }
        String str = (String) map.get(view);
        if (str != null) {
            map.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.f;
    }

    public final HashSet zzf() {
        return this.e;
    }

    public final void zzg() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public final void zzh() {
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        String str;
        zzfko zzfkoVarZza = zzfko.zza();
        if (zzfkoVarZza != null) {
            for (zzfkd zzfkdVar : zzfkoVarZza.zzb()) {
                View viewZzf = zzfkdVar.zzf();
                if (zzfkdVar.zzj()) {
                    String strZzh = zzfkdVar.zzh();
                    HashMap map = this.g;
                    HashSet hashSet = this.f;
                    if (viewZzf != null) {
                        if (viewZzf.isAttachedToWindow()) {
                            boolean zHasWindowFocus = viewZzf.hasWindowFocus();
                            WeakHashMap weakHashMap = this.h;
                            if (zHasWindowFocus) {
                                weakHashMap.remove(viewZzf);
                                bool = Boolean.FALSE;
                            } else if (weakHashMap.containsKey(viewZzf)) {
                                bool = (Boolean) weakHashMap.get(viewZzf);
                            } else {
                                bool = Boolean.FALSE;
                                weakHashMap.put(viewZzf, bool);
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet2 = new HashSet();
                                View view = viewZzf;
                                while (true) {
                                    if (view == null) {
                                        this.d.addAll(hashSet2);
                                        str = null;
                                        break;
                                    }
                                    String strZzb = zzflh.zzb(view);
                                    if (strZzb != null) {
                                        str = strZzb;
                                        break;
                                    } else {
                                        hashSet2.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(strZzh);
                            this.a.put(viewZzf, strZzh);
                            for (zzfkq zzfkqVar : zzfkdVar.zzi()) {
                                View view2 = (View) zzfkqVar.zzb().get();
                                if (view2 != null) {
                                    HashMap map2 = this.b;
                                    zzfli zzfliVar = (zzfli) map2.get(view2);
                                    if (zzfliVar != null) {
                                        zzfliVar.zzc(zzfkdVar.zzh());
                                    } else {
                                        map2.put(view2, new zzfli(zzfkqVar, zzfkdVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            hashSet.add(strZzh);
                            this.c.put(strZzh, viewZzf);
                            map.put(strZzh, str);
                        }
                    } else {
                        hashSet.add(strZzh);
                        map.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.containsKey(view)) {
            return true;
        }
        weakHashMap.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzk(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }
}
