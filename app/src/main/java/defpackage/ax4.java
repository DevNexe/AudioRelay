package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.YKK;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ax4 extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    public class CQf {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public alJ z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public CQf(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, ax4.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.y;
            ax4 ax4Var = ax4.this;
            if (str != null) {
                if (ax4Var.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (ax4Var.d == null) {
                    ax4Var.d = ax4.a(ax4Var.c);
                }
                menuItem.setOnMenuItemClickListener(new QnHx(ax4Var.d, this.y));
            }
            if (this.r >= 2) {
                if (menuItem instanceof YKK) {
                    YKK ykk = (YKK) menuItem;
                    ykk.x = (ykk.x & (-5)) | 4;
                } else if (menuItem instanceof tc2) {
                    tc2 tc2Var = (tc2) menuItem;
                    try {
                        Method method = tc2Var.e;
                        bx4 bx4Var = tc2Var.d;
                        if (method == null) {
                            tc2Var.e = bx4Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        tc2Var.e.invoke(bx4Var, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, ax4.e, ax4Var.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            alJ alj = this.z;
            if (alj != null) {
                if (menuItem instanceof bx4) {
                    ((bx4) menuItem).a(alj);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z2 = menuItem instanceof bx4;
            if (z2) {
                ((bx4) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                rc2.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z2) {
                ((bx4) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                rc2.m(menuItem, charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((bx4) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                rc2.g(menuItem, c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((bx4) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                rc2.k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((bx4) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    rc2.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z2) {
                    ((bx4) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    rc2.i(menuItem, colorStateList);
                }
            }
        }
    }

    public static class QnHx implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public final Object a;
        public final Method b;

        public QnHx(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                StringBuilder sbA = N.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbA.append(cls.getName());
                InflateException inflateException = new InflateException(sbA.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public ax4(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        CQf cQf = new CQf(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = cQf.a;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        cQf.b = 0;
                        cQf.c = 0;
                        cQf.d = 0;
                        cQf.e = 0;
                        cQf.f = true;
                        cQf.g = true;
                    } else if (name2.equals("item")) {
                        if (!cQf.h) {
                            alJ alj = cQf.z;
                            if (alj == null || !alj.a()) {
                                cQf.h = true;
                                cQf.b(menu2.add(cQf.b, cQf.i, cQf.j, cQf.k));
                            } else {
                                cQf.h = true;
                                cQf.b(menu2.addSubMenu(cQf.b, cQf.i, cQf.j, cQf.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                ax4 ax4Var = ax4.this;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = ax4Var.c.obtainStyledAttributes(attributeSet, xApe.J);
                    cQf.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    cQf.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    cQf.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    cQf.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    cQf.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    cQf.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = ax4Var.c;
                    g85 g85Var = new g85(context, context.obtainStyledAttributes(attributeSet, xApe.K));
                    cQf.i = g85Var.h(2, 0);
                    cQf.j = (g85Var.g(5, cQf.c) & (-65536)) | (g85Var.g(6, cQf.d) & 65535);
                    cQf.k = g85Var.j(7);
                    cQf.l = g85Var.j(8);
                    cQf.m = g85Var.h(0, 0);
                    String strI = g85Var.i(9);
                    cQf.n = strI == null ? (char) 0 : strI.charAt(0);
                    cQf.o = g85Var.g(16, 4096);
                    String strI2 = g85Var.i(10);
                    cQf.p = strI2 == null ? (char) 0 : strI2.charAt(0);
                    cQf.q = g85Var.g(20, 4096);
                    if (g85Var.k(11)) {
                        cQf.r = g85Var.a(11, false) ? 1 : 0;
                    } else {
                        cQf.r = cQf.e;
                    }
                    cQf.s = g85Var.a(3, false);
                    cQf.t = g85Var.a(4, cQf.f);
                    cQf.u = g85Var.a(1, cQf.g);
                    cQf.v = g85Var.g(21, -1);
                    cQf.y = g85Var.i(12);
                    cQf.w = g85Var.h(13, 0);
                    cQf.x = g85Var.i(15);
                    String strI3 = g85Var.i(14);
                    boolean z3 = strI3 != null;
                    if (z3 && cQf.w == 0 && cQf.x == null) {
                        cQf.z = (alJ) cQf.a(strI3, f, ax4Var.b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        cQf.z = null;
                    }
                    cQf.A = g85Var.j(17);
                    cQf.B = g85Var.j(22);
                    if (g85Var.k(19)) {
                        cQf.D = bp0.c(g85Var.g(19, -1), cQf.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        cQf.D = null;
                    }
                    if (g85Var.k(18)) {
                        cQf.C = g85Var.b(18);
                    } else {
                        cQf.C = colorStateList;
                    }
                    g85Var.m();
                    cQf.h = false;
                } else if (name3.equals("menu")) {
                    cQf.h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(cQf.b, cQf.i, cQf.j, cQf.k);
                    cQf.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof zw4)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
