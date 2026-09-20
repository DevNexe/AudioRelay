package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.LPt8Fixed;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzczq;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfdw;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzyp;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class d7G implements CustomEventBannerListener, zzyq, zzchh, zzfyk, a46 {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public d7G(int i) {
        this.w = i;
        if (i != 17) {
            if (i != 22) {
                return;
            }
            this.x = new ArrayList();
            Boolean bool = Boolean.FALSE;
            this.y = new Boolean[]{bool, bool, bool};
            return;
        }
        this.x = new HashMap();
        this.y = new n36(1);
        i(new y06(0));
        i(new k26(0));
        i(new y06(1));
        i(new n36(0));
        i(new k26(1));
        i(new y06(2));
        i(new k26(2));
    }

    @Override // defpackage.a46
    public final ma5 a(ez5 ez5Var) {
        ((ma5) this.x).f((String) this.y, ez5Var);
        return (ma5) this.x;
    }

    public final KeyListener b(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((gr0) this.y).a.getClass();
        if (keyListener instanceof kr0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new kr0(keyListener);
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.x).getContext().obtainStyledAttributes(attributeSet, xApe.D, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        gr0 gr0Var = (gr0) this.y;
        if (inputConnection == null) {
            gr0Var.getClass();
            return null;
        }
        gr0.QnHx qnHx = gr0Var.a;
        qnHx.getClass();
        return inputConnection instanceof ir0 ? inputConnection : new ir0(qnHx.a, inputConnection, editorInfo);
    }

    public final void e(boolean z) {
        or0 or0Var = ((gr0) this.y).a.b;
        if (or0Var.z != z) {
            if (or0Var.y != null) {
                LPt8Fixed lPt8A = LPt8Fixed.a();
                or0.QnHx qnHx = or0Var.y;
                lPt8A.getClass();
                C0239D.l(qnHx, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lPt8A.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lPt8A.b.remove(qnHx);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            or0Var.z = z;
            if (z) {
                or0.a(or0Var.w, LPt8Fixed.a().b());
            }
        }
    }

    public final jr2 f() {
        w9 w9VarB = ((i60) this.x).b();
        us2 us2Var = ((c63) this.y).a;
        us2Var.getClass();
        vq2 vq2VarK = vq2.k(w9VarB, new hr2(us2Var), new nc4(this, 1));
        CY cy = new CY(4);
        vq2VarK.getClass();
        return new jr2(vq2VarK, new m91.MZ(cy), new m91.RBi(cy), new m91.y(cy));
    }

    public final Object g() {
        String str;
        gx6 gx6Var = (gx6) this.x;
        String str2 = (String) this.y;
        ContentResolver contentResolver = gx6Var.a.getContentResolver();
        Uri uri = lw6.a;
        synchronized (lw6.class) {
            if (lw6.e == null) {
                lw6.d.set(false);
                lw6.e = new HashMap();
                lw6.j = new Object();
                contentResolver.registerContentObserver(lw6.a, true, new jw6());
            } else if (lw6.d.getAndSet(false)) {
                lw6.e.clear();
                lw6.f.clear();
                lw6.g.clear();
                lw6.h.clear();
                lw6.i.clear();
                lw6.j = new Object();
            }
            Object obj = lw6.j;
            str = null;
            if (lw6.e.containsKey(str2)) {
                String str3 = (String) lw6.e.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = lw6.k.length;
                Cursor cursorQuery = contentResolver.query(lw6.a, null, null, new String[]{str2}, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (lw6.class) {
                                if (obj == lw6.j) {
                                    lw6.e.put(str2, string);
                                }
                            }
                            if (string != null) {
                                str = string;
                            }
                        } else {
                            synchronized (lw6.class) {
                                if (obj == lw6.j) {
                                    lw6.e.put(str2, null);
                                }
                            }
                        }
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
            }
        }
        return str;
    }

    public final ez5 h(ma5 ma5Var, ez5 ez5Var) {
        nw6.c(ma5Var);
        if (!(ez5Var instanceof mz5)) {
            return ez5Var;
        }
        mz5 mz5Var = (mz5) ez5Var;
        ArrayList arrayList = mz5Var.x;
        Map map = (Map) this.x;
        String str = mz5Var.w;
        return (map.containsKey(str) ? (n16) ((Map) this.x).get(str) : (n36) this.y).a(str, ma5Var, arrayList);
    }

    public final void i(n16 n16Var) {
        Iterator it = n16Var.a.iterator();
        while (it.hasNext()) {
            ((Map) this.x).put(Integer.valueOf(((u46) it.next()).w).toString(), n16Var);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzcgn.zze("Custom event adapter called onAdClicked.");
        ((MediationBannerListener) this.y).onAdClicked((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzcgn.zze("Custom event adapter called onAdClosed.");
        ((MediationBannerListener) this.y).onAdClosed((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzcgn.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationBannerListener) this.y).onAdFailedToLoad((CustomEventAdapter) this.x, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzcgn.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationBannerListener) this.y).onAdLeftApplication((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzcgn.zze("Custom event adapter called onAdLoaded.");
        Object obj = this.x;
        ((CustomEventAdapter) obj).a = view;
        ((MediationBannerListener) this.y).onAdLoaded((CustomEventAdapter) obj);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzcgn.zze("Custom event adapter called onAdOpened.");
        ((MediationBannerListener) this.y).onAdOpened((CustomEventAdapter) this.x);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    @Override // com.google.android.gms.internal.ads.zzyq
    public final zzyp zza(zzzg zzzgVar, long j) {
        int iB;
        long jZzc;
        long jZzf = zzzgVar.zzf();
        int iMin = (int) Math.min(20000L, zzzgVar.zzd() - jZzf);
        ((zzed) this.y).zzC(iMin);
        ((zzyv) zzzgVar).zzm(((zzed) this.y).zzH(), 0, iMin, false);
        zzed zzedVar = (zzed) this.y;
        int iZzc = -1;
        long j2 = -9223372036854775807L;
        int iZzc2 = -1;
        while (zzedVar.zza() >= 4) {
            if (qw5.b(zzedVar.zzc(), zzedVar.zzH()) != 442) {
                zzedVar.zzG(1);
            } else {
                zzedVar.zzG(4);
                long jA = rw5.a(zzedVar);
                if (jA != -9223372036854775807L) {
                    long jZzb = ((zzej) this.x).zzb(jA);
                    if (jZzb > j) {
                        if (j2 == -9223372036854775807L) {
                            return zzyp.zzd(jZzb, jZzf);
                        }
                        jZzc = iZzc2;
                    } else if (100000 + jZzb > j) {
                        jZzc = zzedVar.zzc();
                    } else {
                        iZzc2 = zzedVar.zzc();
                        j2 = jZzb;
                    }
                    return zzyp.zze(jZzf + jZzc);
                }
                int iZzd = zzedVar.zzd();
                if (zzedVar.zza() >= 10) {
                    zzedVar.zzG(9);
                    int iZzk = zzedVar.zzk() & 7;
                    if (zzedVar.zza() >= iZzk) {
                        zzedVar.zzG(iZzk);
                        if (zzedVar.zza() >= 4) {
                            if (qw5.b(zzedVar.zzc(), zzedVar.zzH()) == 443) {
                                zzedVar.zzG(4);
                                int iZzo = zzedVar.zzo();
                                if (zzedVar.zza() >= iZzo) {
                                    zzedVar.zzG(iZzo);
                                    while (zzedVar.zza() >= 4) {
                                        iB = qw5.b(zzedVar.zzc(), zzedVar.zzH());
                                        if (iB == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                zzedVar.zzF(iZzd);
                            } else {
                                while (zzedVar.zza() >= 4) {
                                    iB = qw5.b(zzedVar.zzc(), zzedVar.zzH());
                                    if (iB == 442 || iB == 441 || (iB >>> 8) != 1) {
                                        break;
                                    }
                                    zzedVar.zzG(4);
                                    if (zzedVar.zza() < 2) {
                                        zzedVar.zzF(iZzd);
                                        break;
                                    }
                                    zzedVar.zzF(Math.min(zzedVar.zzd(), zzedVar.zzc() + zzedVar.zzo()));
                                }
                            }
                        } else {
                            zzedVar.zzF(iZzd);
                        }
                    } else {
                        zzedVar.zzF(iZzd);
                    }
                } else {
                    zzedVar.zzF(iZzd);
                }
                iZzc = zzedVar.zzc();
            }
        }
        return j2 != -9223372036854775807L ? zzyp.zzf(j2, jZzf + ((long) iZzc)) : zzyp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final void zzb() {
        zzed zzedVar = (zzed) this.y;
        byte[] bArr = zzel.zzf;
        int length = bArr.length;
        zzedVar.zzD(bArr, 0);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzcgn.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationBannerListener) this.y).onAdFailedToLoad((CustomEventAdapter) this.x, adError);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        switch (this.w) {
            case 14:
                String str = (String) obj;
                zzcux zzcuxVar = (zzcux) this.y;
                zzfdw zzfdwVar = zzcuxVar.D;
                zzfjq zzfjqVar = zzcuxVar.C;
                zzfde zzfdeVar = zzcuxVar.A;
                String str2 = (String) this.x;
                zzfcs zzfcsVar = zzcuxVar.B;
                zzfdwVar.zza(zzfjqVar.zzd(zzfdeVar, zzfcsVar, false, str2, str, zzfcsVar.zzd));
                break;
            case 15:
                zzcha.zze.execute(new zzczn((zzczq) this.y));
                ((zzfyk) this.x).mo32zzb((zzczc) obj);
                break;
            default:
                ((zzcmn) obj).zzd((String) this.x, (Map) this.y);
                break;
        }
    }

    public /* synthetic */ d7G(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public d7G(zzbtl zzbtlVar, zzchf zzchfVar) {
        this.w = 13;
        this.x = zzchfVar;
        this.y = zzbtlVar;
    }

    public /* synthetic */ d7G(Object obj, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public /* synthetic */ d7G(String str, zzakj zzakjVar) {
        this.w = 12;
        this.x = str;
        this.y = zzakjVar;
    }

    public d7G(Map map) {
        this.w = 16;
        this.x = "sendMessageToNativeJs";
        this.y = map;
    }

    public /* synthetic */ d7G(zzej zzejVar) {
        this.w = 11;
        this.x = zzejVar;
        this.y = new zzed();
    }

    public d7G(vl1.CQf cQf, vl1.QnHx qnHx) {
        this.w = 2;
        this.x = qnHx;
        this.y = cQf;
    }

    public d7G(lKy3 lky3, xT xTVar) {
        this.w = 3;
        this.x = lky3;
        this.y = xTVar;
    }

    public d7G(pq2 pq2Var, vm1 vm1Var) {
        this.w = 6;
        this.x = pq2Var;
        this.y = vm1Var;
    }

    public d7G(cq4 cq4Var, ln2 ln2Var) {
        this.w = 5;
        this.x = cq4Var;
        this.y = ln2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    /* JADX INFO: renamed from: zza */
    public final void mo43zza() {
        ((zzchf) this.x).zze(new zzbtu("Unable to obtain a JavascriptEngine."));
        ((zzbtl) this.y).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        switch (this.w) {
            case 14:
                zzcux zzcuxVar = (zzcux) this.y;
                zzfdw zzfdwVar = zzcuxVar.D;
                zzfjq zzfjqVar = zzcuxVar.C;
                zzfde zzfdeVar = zzcuxVar.A;
                String str = (String) this.x;
                zzfcs zzfcsVar = zzcuxVar.B;
                zzfdwVar.zza(zzfjqVar.zzd(zzfdeVar, zzfcsVar, false, str, null, zzfcsVar.zzd));
                break;
            case 15:
                zzcha.zze.execute(new zzczn((zzczq) this.y));
                ((zzfyk) this.x).zza(th);
                break;
        }
    }

    public d7G(Context context, gk0 gk0Var) {
        this.w = 8;
        this.x = context;
        this.y = gk0Var;
    }

    public d7G(ef4 ef4Var, ot4 ot4Var) {
        this.w = 7;
        this.x = ef4Var;
        this.y = ot4Var;
    }

    public d7G(i60 i60Var, c63 c63Var) {
        this.w = 4;
        this.x = i60Var;
        this.y = c63Var;
    }

    public d7G(EditText editText) {
        this.w = 0;
        this.x = editText;
        this.y = new gr0(editText);
    }
}
