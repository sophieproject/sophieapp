package appinventor.ai_williamkenzie81.Sophie_Alerts;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Ball;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0609runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0621lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: Error.yail */
public class Error extends Form implements Runnable {
    public static Error Error;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Error").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final IntNum Lit11;
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit13;
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Easter_Egg").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("PointInDirection").readResolve());
    static final IntNum Lit23 = IntNum.make(0);
    static final PairWithPosition Lit24 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 98397), "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 98389);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Speed").readResolve());
    static final IntNum Lit26 = IntNum.make(10);
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Error$Initialize").readResolve());
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final IntNum Lit31 = IntNum.make(16777215);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit33 = IntNum.make(-1025);
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit35 = IntNum.make(-2);
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement2").readResolve());
    static final IntNum Lit39 = IntNum.make(16777215);
    static final IntNum Lit4;
    static final IntNum Lit40 = IntNum.make(-1033);
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement3").readResolve());
    static final IntNum Lit49 = IntNum.make(16777215);
    static final SimpleSymbol Lit5;
    static final IntNum Lit50 = IntNum.make(-1033);
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit57 = IntNum.make(1);
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit59;
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("Canvas1").readResolve());
    static final IntNum Lit63;
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Ball");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("PaintColor").readResolve());
    static final IntNum Lit67;
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Radius").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("X").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit70 = IntNum.make(149);
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Y").readResolve());
    static final IntNum Lit72 = IntNum.make(83);
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Ball");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("$xvel").readResolve());
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("$yvel").readResolve());
    static final PairWithPosition Lit76 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 446597), "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 446589);
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("$speed").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Easter_Egg$Flung").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Flung").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Bounce").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("$edge").readResolve());
    static final PairWithPosition Lit82 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 454748);
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Easter_Egg$EdgeReached").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("EdgeReached").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("$other").readResolve());
    static final PairWithPosition Lit86;
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Easter_Egg$CollidedWith").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("CollidedWith").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve());
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Canvas Canvas1;
    public Ball Easter_Egg;
    public final ModuleMethod Easter_Egg$CollidedWith;
    public final ModuleMethod Easter_Egg$EdgeReached;
    public final ModuleMethod Easter_Egg$Flung;
    public final ModuleMethod Error$Initialize;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public HorizontalScrollArrangement HorizontalScrollArrangement2;
    public HorizontalScrollArrangement HorizontalScrollArrangement3;
    public Image Image1;
    public Label Label1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit5 = simpleSymbol;
        Lit86 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1605285917371_0.8317993362457963-0/youngandroidproject/../src/appinventor/ai_williamkenzie81/Sophie_Alerts/Error.yail", 462941);
        int[] iArr = new int[2];
        iArr[0] = -9270823;
        Lit67 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -14803426;
        Lit63 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit59 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -14803426;
        Lit15 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -9270823;
        Lit13 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -14803426;
        Lit11 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -9270823;
        Lit4 = IntNum.make(iArr7);
    }

    public Error() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit89, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit90, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit91, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit92, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit93, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit94, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit95, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit96, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit97, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit98, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit99, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit100, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit101, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit102, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7098639402960890708.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        this.Error$Initialize = new ModuleMethod(frame2, 21, Lit27, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, (Object) null, 0);
        this.Easter_Egg$Flung = new ModuleMethod(frame2, 36, Lit78, 24582);
        this.Easter_Egg$EdgeReached = new ModuleMethod(frame2, 37, Lit83, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Easter_Egg$CollidedWith = new ModuleMethod(frame2, 38, Lit87, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        C0609runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Error = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0609runtime.$instance.run();
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Sophie_Alerts", Lit9);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit5);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit7);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "Responsive", Lit9);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "AppTheme.Light.DarkActionBar", Lit9);
            C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "Error", Lit9);
            Values.writeValues(C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit27, this.Error$Initialize);
        } else {
            addToFormEnvironment(Lit27, this.Error$Initialize);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Error", "Initialize");
        } else {
            addToEvents(Lit0, Lit28);
        }
        this.HorizontalScrollArrangement1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit29, Lit30, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit36, Lit30, lambda$Fn4);
        }
        this.HorizontalScrollArrangement2 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit30, Lit37, Lit38, lambda$Fn5), $result);
        } else {
            addToComponents(Lit30, Lit41, Lit38, lambda$Fn6);
        }
        this.Image1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit30, Lit42, Lit43, lambda$Fn7), $result);
        } else {
            addToComponents(Lit30, Lit46, Lit43, lambda$Fn8);
        }
        this.HorizontalScrollArrangement3 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit30, Lit47, Lit48, lambda$Fn9), $result);
        } else {
            addToComponents(Lit30, Lit51, Lit48, lambda$Fn10);
        }
        this.Label1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit52, Lit53, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit60, Lit53, lambda$Fn12);
        }
        this.Canvas1 = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, lambda$Fn13), $result);
        } else {
            addToComponents(Lit0, Lit64, Lit62, lambda$Fn14);
        }
        this.Easter_Egg = null;
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0609runtime.addComponentWithinRepl(Lit62, Lit65, Lit21, lambda$Fn15), $result);
        } else {
            addToComponents(Lit62, Lit73, Lit21, lambda$Fn16);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit78, this.Easter_Egg$Flung);
        } else {
            addToFormEnvironment(Lit78, this.Easter_Egg$Flung);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Easter_Egg", "Flung");
        } else {
            addToEvents(Lit21, Lit79);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit83, this.Easter_Egg$EdgeReached);
        } else {
            addToFormEnvironment(Lit83, this.Easter_Egg$EdgeReached);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Easter_Egg", "EdgeReached");
        } else {
            addToEvents(Lit21, Lit84);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0609runtime.addToCurrentFormEnvironment(Lit87, this.Easter_Egg$CollidedWith);
        } else {
            addToFormEnvironment(Lit87, this.Easter_Egg$CollidedWith);
        }
        if (C0609runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0609runtime.$Stthis$Mnform$St, "Easter_Egg", "CollidedWith");
        } else {
            addToEvents(Lit21, Lit88);
        }
        C0609runtime.initRuntime();
    }

    static Object lambda3() {
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Sophie_Alerts", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "Responsive", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "AppTheme.Light.DarkActionBar", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "Error", Lit9);
        return C0609runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit7);
    }

    public Object Error$Initialize() {
        C0609runtime.setThisForm();
        C0609runtime.callComponentMethod(Lit21, Lit22, LList.list2(Lit23, Lit23), Lit24);
        return C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit25, Lit26, Lit5);
    }

    static Object lambda4() {
        C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit10, Lit31, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit33, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit34, Lit35, Lit5);
    }

    static Object lambda5() {
        C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit10, Lit31, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit33, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit30, Lit34, Lit35, Lit5);
    }

    static Object lambda6() {
        C0609runtime.setAndCoerceProperty$Ex(Lit38, Lit10, Lit39, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit38, Lit34, Lit40, Lit5);
    }

    static Object lambda7() {
        C0609runtime.setAndCoerceProperty$Ex(Lit38, Lit10, Lit39, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit38, Lit34, Lit40, Lit5);
    }

    static Object lambda8() {
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit32, Lit35, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit44, "Sophie.png", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit45, Boolean.TRUE, Lit7);
        return C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit34, Lit35, Lit5);
    }

    static Object lambda9() {
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit32, Lit35, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit44, "Sophie.png", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit45, Boolean.TRUE, Lit7);
        return C0609runtime.setAndCoerceProperty$Ex(Lit43, Lit34, Lit35, Lit5);
    }

    static Object lambda10() {
        C0609runtime.setAndCoerceProperty$Ex(Lit48, Lit10, Lit49, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit48, Lit34, Lit50, Lit5);
    }

    static Object lambda11() {
        C0609runtime.setAndCoerceProperty$Ex(Lit48, Lit10, Lit49, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit48, Lit34, Lit50, Lit5);
    }

    static Object lambda12() {
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit54, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit55, "Reconnect to the internet to view Alerts", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit56, Lit57, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit58, Lit59, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit34, Lit35, Lit5);
    }

    static Object lambda13() {
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit54, Boolean.TRUE, Lit7);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit55, "Reconnect to the internet to view Alerts", Lit9);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit56, Lit57, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit58, Lit59, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit53, Lit34, Lit35, Lit5);
    }

    static Object lambda14() {
        C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit10, Lit63, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Lit35, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit34, Lit35, Lit5);
    }

    static Object lambda15() {
        C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit10, Lit63, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Lit35, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit62, Lit34, Lit35, Lit5);
    }

    static Object lambda16() {
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit66, Lit67, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit68, Lit26, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit25, Lit26, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit69, Lit70, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit71, Lit72, Lit5);
    }

    static Object lambda17() {
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit66, Lit67, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit68, Lit26, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit25, Lit26, Lit5);
        C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit69, Lit70, Lit5);
        return C0609runtime.setAndCoerceProperty$Ex(Lit21, Lit71, Lit72, Lit5);
    }

    public Object Easter_Egg$Flung(Object $x, Object $y, Object $speed, Object $heading, Object $xvel, Object $yvel) {
        C0609runtime.sanitizeComponentData($x);
        C0609runtime.sanitizeComponentData($y);
        Object $speed2 = C0609runtime.sanitizeComponentData($speed);
        C0609runtime.sanitizeComponentData($heading);
        Object $xvel2 = C0609runtime.sanitizeComponentData($xvel);
        Object $yvel2 = C0609runtime.sanitizeComponentData($yvel);
        C0609runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit21;
        SimpleSymbol simpleSymbol2 = Lit22;
        if ($xvel2 instanceof Package) {
            $xvel2 = C0609runtime.signalRuntimeError(strings.stringAppend("The variable ", C0609runtime.getDisplayRepresentation(Lit74), " is not bound in the current context"), "Unbound Variable");
        }
        if ($yvel2 instanceof Package) {
            $yvel2 = C0609runtime.signalRuntimeError(strings.stringAppend("The variable ", C0609runtime.getDisplayRepresentation(Lit75), " is not bound in the current context"), "Unbound Variable");
        }
        C0609runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2($xvel2, $yvel2), Lit76);
        SimpleSymbol simpleSymbol3 = Lit21;
        SimpleSymbol simpleSymbol4 = Lit25;
        if ($speed2 instanceof Package) {
            $speed2 = C0609runtime.signalRuntimeError(strings.stringAppend("The variable ", C0609runtime.getDisplayRepresentation(Lit77), " is not bound in the current context"), "Unbound Variable");
        }
        return C0609runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, $speed2, Lit5);
    }

    public Object Easter_Egg$EdgeReached(Object $edge) {
        Object $edge2 = C0609runtime.sanitizeComponentData($edge);
        C0609runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit21;
        SimpleSymbol simpleSymbol2 = Lit80;
        if ($edge2 instanceof Package) {
            $edge2 = C0609runtime.signalRuntimeError(strings.stringAppend("The variable ", C0609runtime.getDisplayRepresentation(Lit81), " is not bound in the current context"), "Unbound Variable");
        }
        return C0609runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1($edge2), Lit82);
    }

    public Object Easter_Egg$CollidedWith(Object $other) {
        Object $other2 = C0609runtime.sanitizeComponentData($other);
        C0609runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit21;
        SimpleSymbol simpleSymbol2 = Lit80;
        if ($other2 instanceof Package) {
            $other2 = C0609runtime.signalRuntimeError(strings.stringAppend("The variable ", C0609runtime.getDisplayRepresentation(Lit85), " is not bound in the current context"), "Unbound Variable");
        }
        return C0609runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1($other2), Lit86);
    }

    /* compiled from: Error.yail */
    public class frame extends ModuleBody {
        Error $main;

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            return moduleMethod.selector == 36 ? this.$main.Easter_Egg$Flung(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]) : super.applyN(moduleMethod, objArr);
        }

        public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
            if (moduleMethod.selector != 36) {
                return super.matchN(moduleMethod, objArr, callContext);
            }
            callContext.values = objArr;
            callContext.proc = moduleMethod;
            callContext.f221pc = 5;
            return 0;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Error)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Error)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 37:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                case 38:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Error)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Error)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                case 37:
                    return this.$main.Easter_Egg$EdgeReached(obj);
                case 38:
                    return this.$main.Easter_Egg$CollidedWith(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Error error = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    error.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Error.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Error.lambda3();
                case 21:
                    return this.$main.Error$Initialize();
                case 22:
                    return Error.lambda4();
                case 23:
                    return Error.lambda5();
                case 24:
                    return Error.lambda6();
                case 25:
                    return Error.lambda7();
                case 26:
                    return Error.lambda8();
                case 27:
                    return Error.lambda9();
                case 28:
                    return Error.lambda10();
                case 29:
                    return Error.lambda11();
                case 30:
                    return Error.lambda12();
                case 31:
                    return Error.lambda13();
                case 32:
                    return Error.lambda14();
                case 33:
                    return Error.lambda15();
                case 34:
                    return Error.lambda16();
                case 35:
                    return Error.lambda17();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f221pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(false);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0621lists.cons(C0621lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0621lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0621lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0621lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0621lists.cons(componentObject, C0621lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Error = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0621lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0621lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = C0621lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0621lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0621lists.caddr.apply1(component$Mninfo);
                C0621lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0621lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0621lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0621lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0621lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0621lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0621lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0621lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0621lists.caddr.apply1(component$Mninfo3);
                C0621lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
