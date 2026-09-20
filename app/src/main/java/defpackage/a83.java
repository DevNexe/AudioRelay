package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RBi;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a83 implements ba {
    public /* synthetic */ a83(b83 b83Var) {
    }

    public static final void a(int i, View view) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (RBi.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (RBi.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i2 == 2) {
            if (RBi.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i2 != 3) {
            return;
        }
        if (RBi.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(GM.a("Unknown visibility ", i));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i == 3) {
            return "GONE";
        }
        return i == 4 ? "INVISIBLE" : "null";
    }

    @Override // defpackage.ba
    public Object apply(Object obj, Object obj2) {
        bl blVar = (bl) obj;
        bl blVar2 = (bl) obj2;
        String str = blVar2.a;
        boolean z = str.length() == 0;
        String str2 = blVar.b;
        String str3 = blVar2.b;
        if (z) {
            str = (str3.length() > 0) && !ur1.a(str2, str3) ? "" : blVar.a;
        }
        if (!(str3.length() == 0)) {
            str2 = str3;
        }
        return new bl(str, str2, blVar2.c);
    }
}
