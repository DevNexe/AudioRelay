package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.azefsw.audioconnect.R;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.g14c;
import defpackage.g85;
import defpackage.s85;
import defpackage.xApe;
import defpackage.yf0;
import defpackage.yu3;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed implements yf0 {
    public final Toolbar a;
    public int b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public int l;
    public Drawable m;

    public LPt8Fixed(Toolbar toolbar) {
        Drawable drawable;
        this.l = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        g85 g85VarL = g85.l(toolbar.getContext(), null, xApe.x, R.attr.actionBarStyle);
        this.m = g85VarL.e(15);
        CharSequence charSequenceJ = g85VarL.j(27);
        if (!TextUtils.isEmpty(charSequenceJ)) {
            this.g = true;
            this.h = charSequenceJ;
            if ((this.b & 8) != 0) {
                toolbar.setTitle(charSequenceJ);
                if (this.g) {
                    bi5.n(toolbar.getRootView(), charSequenceJ);
                }
            }
        }
        CharSequence charSequenceJ2 = g85VarL.j(25);
        if (!TextUtils.isEmpty(charSequenceJ2)) {
            this.i = charSequenceJ2;
            if ((this.b & 8) != 0) {
                toolbar.setSubtitle(charSequenceJ2);
            }
        }
        Drawable drawableE = g85VarL.e(20);
        if (drawableE != null) {
            this.e = drawableE;
            g();
        }
        Drawable drawableE2 = g85VarL.e(17);
        if (drawableE2 != null) {
            setIcon(drawableE2);
        }
        if (this.f == null && (drawable = this.m) != null) {
            this.f = drawable;
            if ((this.b & 4) != 0) {
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
        }
        f(g85VarL.g(10, 0));
        int iH = g85VarL.h(9, 0);
        if (iH != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iH, (ViewGroup) toolbar, false);
            View view = this.c;
            if (view != null && (this.b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.c = viewInflate;
            if (viewInflate != null && (this.b & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            f(this.b | 16);
        }
        int layoutDimension = g85VarL.b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int iC = g85VarL.c(7, -1);
        int iC2 = g85VarL.c(3, -1);
        if (iC >= 0 || iC2 >= 0) {
            int iMax = Math.max(iC, 0);
            int iMax2 = Math.max(iC2, 0);
            if (toolbar.P == null) {
                toolbar.P = new yu3();
            }
            toolbar.P.a(iMax, iMax2);
        }
        int iH2 = g85VarL.h(28, 0);
        if (iH2 != 0) {
            Context context = toolbar.getContext();
            toolbar.H = iH2;
            g14c g14cVar = toolbar.x;
            if (g14cVar != null) {
                g14cVar.setTextAppearance(context, iH2);
            }
        }
        int iH3 = g85VarL.h(26, 0);
        if (iH3 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.I = iH3;
            g14c g14cVar2 = toolbar.y;
            if (g14cVar2 != null) {
                g14cVar2.setTextAppearance(context2, iH3);
            }
        }
        int iH4 = g85VarL.h(22, 0);
        if (iH4 != 0) {
            toolbar.setPopupTheme(iH4);
        }
        g85VarL.m();
        if (R.string.abc_action_bar_up_description != this.l) {
            this.l = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i = this.l;
                String string = i != 0 ? e().getString(i) : null;
                this.j = string;
                if ((this.b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.l);
                    } else {
                        toolbar.setNavigationContentDescription(this.j);
                    }
                }
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new s85(this));
    }

    @Override // defpackage.yf0
    public final void a() {
        QnHx qnHx;
        ActionMenuView actionMenuView = this.a.w;
        if (actionMenuView == null || (qnHx = actionMenuView.O) == null) {
            return;
        }
        qnHx.h();
        QnHx.C0019QnHx c0019QnHx = qnHx.O;
        if (c0019QnHx == null || !c0019QnHx.b()) {
            return;
        }
        c0019QnHx.j.dismiss();
    }

    @Override // defpackage.yf0
    public final void b(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                bi5.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.yf0
    public final void c(int i) {
        this.e = i != 0 ? XTd3.l(e(), i) : null;
        g();
    }

    @Override // defpackage.yf0
    public final void d(Window.Callback callback) {
        this.k = callback;
    }

    public final Context e() {
        return this.a.getContext();
    }

    public final void f(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.j)) {
                        toolbar.setNavigationContentDescription(this.l);
                    } else {
                        toolbar.setNavigationContentDescription(this.j);
                    }
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                g();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void g() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.yf0
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.yf0
    public final void setIcon(int i) {
        setIcon(i != 0 ? XTd3.l(e(), i) : null);
    }

    @Override // defpackage.yf0
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        g();
    }
}
