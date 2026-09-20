package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class o8 {
    public final Context a;
    public ok4<bx4, MenuItem> b;
    public ok4<fx4, SubMenu> c;

    public o8(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof bx4)) {
            return menuItem;
        }
        bx4 bx4Var = (bx4) menuItem;
        if (this.b == null) {
            this.b = new ok4<>();
        }
        MenuItem orDefault = this.b.getOrDefault(bx4Var, null);
        if (orDefault != null) {
            return orDefault;
        }
        tc2 tc2Var = new tc2(this.a, bx4Var);
        this.b.put(bx4Var, tc2Var);
        return tc2Var;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof fx4)) {
            return subMenu;
        }
        fx4 fx4Var = (fx4) subMenu;
        if (this.c == null) {
            this.c = new ok4<>();
        }
        SubMenu orDefault = this.c.getOrDefault(fx4Var, null);
        if (orDefault != null) {
            return orDefault;
        }
        xv4 xv4Var = new xv4(this.a, fx4Var);
        this.c.put(fx4Var, xv4Var);
        return xv4Var;
    }
}
