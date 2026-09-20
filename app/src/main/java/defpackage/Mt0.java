package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class Mt0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static Mt0 c;
    public qp3 a;

    public class QnHx implements qp3.YKK {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = c75.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{c75.b, c75.d, c75.c, c75.f}, new int[]{c75.b(context, R.attr.colorButtonNormal), lv.b(iC, i), lv.b(iC, i), i});
        }

        public static LayerDrawable c(qp3 qp3Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableF = qp3Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable drawableF2 = qp3Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableF;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableF.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableF2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableF2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = bp0.a;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = Mt0.b;
            }
            drawableMutate.setColorFilter(Mt0.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return XTd3.k(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return XTd3.k(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, c75.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, c75.c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return XTd3.k(context, R.color.abc_tint_spinner);
                }
                if (a(this.b, i)) {
                    return c75.d(context, R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return XTd3.k(context, R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return XTd3.k(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return XTd3.k(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = c75.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = c75.b;
                iArr2[0] = c75.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = c75.e;
                iArr2[1] = c75.c(context, R.attr.colorControlActivated);
                iArr[2] = c75.f;
                iArr2[2] = c75.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = c75.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = c75.e;
                iArr2[1] = c75.c(context, R.attr.colorControlActivated);
                iArr[2] = c75.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized Mt0 a() {
        if (c == null) {
            d();
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return qp3.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            Mt0 mt0 = new Mt0();
            c = mt0;
            mt0.a = qp3.d();
            qp3 qp3Var = c.a;
            QnHx qnHx = new QnHx();
            synchronized (qp3Var) {
                qp3Var.g = qnHx;
            }
        }
    }

    public static void e(Drawable drawable, e85 e85Var, int[] iArr) {
        PorterDuff.Mode mode = qp3.h;
        int[] state = drawable.getState();
        int[] iArr2 = bp0.a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e85Var.d;
        if (z || e85Var.c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z ? e85Var.a : null;
            PorterDuff.Mode mode2 = e85Var.c ? e85Var.b : qp3.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = qp3.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
