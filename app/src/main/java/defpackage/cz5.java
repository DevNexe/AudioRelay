package defpackage;

import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapg;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzarl;
import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzdfn;
import com.google.android.gms.internal.ads.zzdig;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class cz5 implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ cz5(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.w) {
            case 0:
                synchronized (((zzaou) this.x).H) {
                    if (((zzaou) this.x).I) {
                        return;
                    }
                    ((zzaou) this.x).I = true;
                    try {
                        zzaou.a((zzaou) this.x);
                        break;
                    } catch (Exception e) {
                        ((zzaou) this.x).B.zzc(2023, -1L, e);
                    }
                    synchronized (((zzaou) this.x).H) {
                        ((zzaou) this.x).I = false;
                        break;
                    }
                    return;
                }
            case 1:
                zzbiy.zzc(((zzaqb) this.x).a);
                return;
            case 2:
                zzarl zzarlVar = (zzarl) this.x;
                try {
                    try {
                        zzaqb zzaqbVar = zzarlVar.a;
                        Class<?> clsLoadClass = zzaqbVar.zzi().loadClass(new String(zzarlVar.a.zze().zzb(zzaqbVar.zzu(), zzarlVar.b), "UTF-8"));
                        if (clsLoadClass == null) {
                            countDownLatch = zzarlVar.f;
                        } else {
                            zzarlVar.d = clsLoadClass.getMethod(new String(zzarlVar.a.zze().zzb(zzarlVar.a.zzu(), zzarlVar.c), "UTF-8"), zzarlVar.e);
                            countDownLatch = zzarlVar.d == null ? zzarlVar.f : zzarlVar.f;
                        }
                    } catch (NullPointerException unused) {
                        countDownLatch = zzarlVar.f;
                    } catch (Throwable th) {
                        zzarlVar.f.countDown();
                        throw th;
                    }
                } catch (zzapg | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 3:
                i26 i26Var = (i26) this.x;
                if (i26Var.b0) {
                    return;
                }
                i26Var.K.zze(i26Var);
                return;
            case 4:
                synchronized (((p36) this.x).y) {
                    p36 p36Var = (p36) this.x;
                    if (p36Var.z && p36Var.A) {
                        p36Var.z = false;
                        zzcgn.zze("App went background");
                        Iterator it = ((p36) this.x).B.iterator();
                        while (it.hasNext()) {
                            try {
                                ((zzbcf) it.next()).zza(false);
                            } catch (Exception e2) {
                                zzcgn.zzh("", e2);
                            }
                        }
                    } else {
                        zzcgn.zze("App is still foreground");
                    }
                    break;
                }
                return;
            case 5:
                int i = zzcik.O;
                ((zzcik) this.x).b("surfaceCreated", new String[0]);
                return;
            case 6:
                super/*android.webkit.WebView*/.destroy();
                return;
            default:
                zzdfn zzdfnVar = (zzdfn) ((WeakReference) this.x).get();
                if (zzdfnVar != null) {
                    zzdfnVar.a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdfk
                        @Override // com.google.android.gms.internal.ads.zzdig
                        public final void zza(Object obj) {
                            ((zzdfo) obj).zza();
                        }
                    });
                    return;
                }
                return;
        }
    }

    public /* synthetic */ cz5(zzdfn zzdfnVar) {
        this.w = 7;
        this.x = new WeakReference(zzdfnVar);
    }
}
