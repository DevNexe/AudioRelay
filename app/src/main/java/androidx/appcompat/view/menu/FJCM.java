package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class FJCM extends NUlFixed implements SubMenu {
    public final NUlFixed x;
    public final YKK y;

    public FJCM(Context context, NUlFixed nUl, YKK ykk) {
        super(context);
        this.x = nUl;
        this.y = ykk;
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean d(YKK ykk) {
        return this.x.d(ykk);
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean e(NUlFixed nUl, MenuItem menuItem) {
        return super.e(nUl, menuItem) || this.x.e(nUl, menuItem);
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean f(YKK ykk) {
        return this.x.f(ykk);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.y;
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final NUlFixed j() {
        return this.x.j();
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean l() {
        return this.x.l();
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean m() {
        return this.x.m();
    }

    @Override // androidx.appcompat.view.menu.NUlFixed
    public final boolean n() {
        return this.x.n();
    }

    @Override // androidx.appcompat.view.menu.NUlFixed, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.x.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        r(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        r(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        r(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.y.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.NUlFixed, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.x.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        r(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        r(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.y.setIcon(i);
        return this;
    }
}
