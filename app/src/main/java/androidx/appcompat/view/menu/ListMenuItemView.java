package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.g85;
import defpackage.xApe;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements byN.QnHx, AbsListView.SelectionBoundsAdjuster {
    public CheckBox A;
    public TextView B;
    public ImageView C;
    public ImageView D;
    public LinearLayout E;
    public final Drawable F;
    public final int G;
    public final Context H;
    public boolean I;
    public final Drawable J;
    public final boolean K;
    public LayoutInflater L;
    public boolean M;
    public YKK w;
    public ImageView x;
    public RadioButton y;
    public TextView z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g85 g85VarL = g85.l(getContext(), attributeSet, xApe.L, R.attr.listMenuViewStyle);
        this.F = g85VarL.e(5);
        this.G = g85VarL.h(1, -1);
        this.I = g85VarL.a(7, false);
        this.H = context;
        this.J = g85VarL.e(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.K = typedArrayObtainStyledAttributes.hasValue(0);
        g85VarL.m();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.L == null) {
            this.L = LayoutInflater.from(getContext());
        }
        return this.L;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.D;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        rect.top = this.D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    @Override // androidx.appcompat.view.menu.byN.QnHx
    public final void c(YKK ykk) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.w = ykk;
        setVisibility(ykk.isVisible() ? 0 : 8);
        setTitle(ykk.e);
        setCheckable(ykk.isCheckable());
        NUlFixed nUl = ykk.n;
        if (nUl.n()) {
            if ((nUl.m() ? ykk.j : ykk.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        nUl.m();
        if (z) {
            YKK ykk2 = this.w;
            NUlFixed nUl2 = ykk2.n;
            if (nUl2.n()) {
                if ((nUl2.m() ? ykk2.j : ykk2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.B;
            YKK ykk3 = this.w;
            char c = ykk3.n.m() ? ykk3.j : ykk3.h;
            if (c == 0) {
                string = "";
            } else {
                NUlFixed nUl3 = ykk3.n;
                Resources resources = nUl3.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(nUl3.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = nUl3.m() ? ykk3.k : ykk3.i;
                YKK.c(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                YKK.c(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                YKK.c(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                YKK.c(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                YKK.c(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                YKK.c(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.B.getVisibility() != i) {
            this.B.setVisibility(i);
        }
        setIcon(ykk.getIcon());
        setEnabled(ykk.isEnabled());
        setSubMenuArrowVisible(ykk.hasSubMenu());
        setContentDescription(ykk.q);
    }

    @Override // androidx.appcompat.view.menu.byN.QnHx
    public YKK getItemData() {
        return this.w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = bi5.a;
        bi5.LPt8Fixed.q(this, this.F);
        TextView textView = (TextView) findViewById(R.id.title);
        this.z = textView;
        int i = this.G;
        if (i != -1) {
            textView.setTextAppearance(this.H, i);
        }
        this.B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.J);
        }
        this.D = (ImageView) findViewById(R.id.group_divider);
        this.E = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.x != null && this.I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.y == null && this.A == null) {
            return;
        }
        if ((this.w.x & 4) != 0) {
            if (this.y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.y = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.y;
            view = this.A;
        } else {
            if (this.A == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.A = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A;
            view = this.y;
        }
        if (z) {
            compoundButton.setChecked(this.w.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.A;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.y;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.w.x & 4) != 0) {
            if (this.y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.y = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.y;
        } else {
            if (this.A == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.A = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.M = z;
        this.I = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility((this.K || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.w.n.getClass();
        boolean z = this.M;
        if (z || this.I) {
            ImageView imageView = this.x;
            if (imageView == null && drawable == null && !this.I) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.x = imageView2;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.I) {
                this.x.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.x;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.x.getVisibility() != 0) {
                this.x.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.z.getVisibility() != 8) {
                this.z.setVisibility(8);
            }
        } else {
            this.z.setText(charSequence);
            if (this.z.getVisibility() != 0) {
                this.z.setVisibility(0);
            }
        }
    }
}
