package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class ApLL extends ImageButton {
    public final NWnB w;
    public final V6s x;
    public boolean y;

    public ApLL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.a();
        }
        V6s v6s = this.x;
        if (v6s != null) {
            v6s.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            return nWnB.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            return nWnB.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e85 e85Var;
        V6s v6s = this.x;
        if (v6s == null || (e85Var = v6s.b) == null) {
            return null;
        }
        return e85Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e85 e85Var;
        V6s v6s = this.x;
        if (v6s == null || (e85Var = v6s.b) == null) {
            return null;
        }
        return e85Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.x.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        V6s v6s = this.x;
        if (v6s != null) {
            v6s.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        V6s v6s = this.x;
        if (v6s != null && drawable != null && !this.y) {
            v6s.d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (v6s != null) {
            v6s.a();
            if (this.y) {
                return;
            }
            ImageView imageView = v6s.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(v6s.d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.y = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.x.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        V6s v6s = this.x;
        if (v6s != null) {
            v6s.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        V6s v6s = this.x;
        if (v6s != null) {
            if (v6s.b == null) {
                v6s.b = new e85();
            }
            e85 e85Var = v6s.b;
            e85Var.a = colorStateList;
            e85Var.d = true;
            v6s.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        V6s v6s = this.x;
        if (v6s != null) {
            if (v6s.b == null) {
                v6s.b = new e85();
            }
            e85 e85Var = v6s.b;
            e85Var.b = mode;
            e85Var.c = true;
            v6s.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApLL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d85.a(context);
        this.y = false;
        c75.a(this, getContext());
        NWnB nWnB = new NWnB(this);
        this.w = nWnB;
        nWnB.d(attributeSet, i);
        V6s v6s = new V6s(this);
        this.x = v6s;
        v6s.b(attributeSet, i);
    }
}
