package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class YV extends EditText implements uu2, h85 {
    public final d7G A;
    public final NWnB w;
    public final YUjp x;
    public final NVzj y;
    public final j65 z;

    public YV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.uu2
    public final d80 a(d80 d80Var) {
        return this.z.a(this, d80Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.a();
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c65.f(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.x.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        NVzj nVzj;
        if (Build.VERSION.SDK_INT >= 28 || (nVzj = this.y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = nVzj.b;
        return textClassifier == null ? NVzj.QnHx.a(nVzj.a) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f A[PHI: r1
  0x005f: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:33:0x0072, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        String[] stringArray;
        InputConnection un1Var;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.x.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            vq0.a(editorInfo, getText());
        }
        X.z(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrE = bi5.e(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrE;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
            }
            sn1 sn1Var = new sn1(this, 0);
            if (i >= 25) {
                un1Var = new tn1(inputConnectionOnCreateInputConnection, sn1Var);
            } else {
                String[] strArr = vq0.a;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    un1Var = new un1(inputConnectionOnCreateInputConnection, sn1Var);
                }
            }
            inputConnectionOnCreateInputConnection = un1Var;
        }
        return this.A.d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && bi5.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = H14.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && bi5.e(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                d80.CQf qnHx = i2 >= 31 ? new d80.QnHx(primaryClip, 1) : new d80.F1(primaryClip, 1);
                qnHx.b(i != 16908322 ? 1 : 0);
                bi5.i(this, qnHx.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c65.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.A.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A.b(keyListener));
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

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        YUjp yUjp = this.x;
        yUjp.k(colorStateList);
        yUjp.b();
    }

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        YUjp yUjp = this.x;
        yUjp.l(mode);
        yUjp.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        NVzj nVzj;
        if (Build.VERSION.SDK_INT >= 28 || (nVzj = this.y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVzj.b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        d85.a(context);
        c75.a(this, getContext());
        NWnB nWnB = new NWnB(this);
        this.w = nWnB;
        nWnB.d(attributeSet, R.attr.editTextStyle);
        YUjp yUjp = new YUjp(this);
        this.x = yUjp;
        yUjp.f(attributeSet, R.attr.editTextStyle);
        yUjp.b();
        this.y = new NVzj(this);
        this.z = new j65();
        d7G d7g = new d7G(this);
        this.A = d7g;
        d7g.c(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerB = d7g.b(keyListener);
            if (keyListenerB == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerB);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
