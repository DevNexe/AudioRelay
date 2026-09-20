package defpackage;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzely;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzguz;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class p15 implements zzdme {
    public Object A;
    public Object B;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public /* synthetic */ p15(go.QnHx qnHx) {
        dl3 dl3Var = dl3.e;
        this.w = qnHx;
        this.B = dl3Var;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
    }

    public static void a(Menu menu, int i) {
        int i2;
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = R.string.copy;
        } else if (i3 == 1) {
            i2 = R.string.paste;
        } else if (i3 == 2) {
            i2 = R.string.cut;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.selectAll;
        }
        if (i == 0 || i == 0) {
            throw null;
        }
        menu.add(0, i3, i3, i2).setShowAsAction(1);
    }

    public static void b(Menu menu, int i, h81 h81Var) {
        if (h81Var != null) {
            if (i == 0) {
                throw null;
            }
            if (menu.findItem(i - 1) == null) {
                a(menu, i);
                return;
            }
        }
        if (h81Var == null) {
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (menu.findItem(i2) != null) {
                if (i == 0) {
                    throw null;
                }
                menu.removeItem(i2);
            }
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            h81 h81Var = (h81) this.x;
            if (h81Var != null) {
                h81Var.invoke();
            }
        } else if (itemId == 1) {
            h81 h81Var2 = (h81) this.y;
            if (h81Var2 != null) {
                h81Var2.invoke();
            }
        } else if (itemId == 2) {
            h81 h81Var3 = (h81) this.z;
            if (h81Var3 != null) {
                h81Var3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            h81 h81Var4 = (h81) this.A;
            if (h81Var4 != null) {
                h81Var4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (((h81) this.x) != null) {
            a(menu, 1);
        }
        if (((h81) this.y) != null) {
            a(menu, 2);
        }
        if (((h81) this.z) != null) {
            a(menu, 3);
        }
        if (((h81) this.A) != null) {
            a(menu, 4);
        }
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, 1, (h81) this.x);
        b(menu, 2, (h81) this.y);
        b(menu, 3, (h81) this.z);
        b(menu, 4, (h81) this.A);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zza(zzezo zzezoVar) {
        this.y = zzezoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzb(zzfan zzfanVar) {
        this.x = zzfanVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdme
    public final /* synthetic */ zzdme zzc(zzely zzelyVar) {
        this.B = zzelyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdme
    public final /* synthetic */ zzdme zzd(zzdik zzdikVar) {
        this.z = zzdikVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdme
    public final /* synthetic */ zzdme zze(zzdck zzdckVar) {
        this.A = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdmf zzh() {
        zzguz.zzc((zzdik) this.z, zzdik.class);
        zzguz.zzc((zzdck) this.A, zzdck.class);
        zzguz.zzc((zzely) this.B, zzely.class);
        return new ub6((eb6) this.w, new zzdah(), new zzfeq(), new zzdbs(), new zzdyb(), (zzdik) this.z, (zzdck) this.A, (zzely) this.B, (zzfan) this.x, (zzezo) this.y);
    }
}
