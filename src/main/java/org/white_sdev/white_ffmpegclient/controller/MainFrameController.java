/*
 *  Filename:  MainFrameController.java
 *  Creation Date:  Jul 14, 2020
 *  Purpose:   
 *  Author:    <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * 
 *  *** Creative Commons Attribution 4.0 International Public License ***
 *  Web Version: https://creativecommons.org/licenses/by/4.0/legalcode
 * 
 * By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 * 
 * Section 1 – Definitions.
 * 
 * Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 * Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 * Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 * Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 * Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 * Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 * Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 * Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 * Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 * Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 * You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 * Section 2 – Scope.
 * 
 * License grant.
 * Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 * reproduce and Share the Licensed Material, in whole or in part; and
 * produce, reproduce, and Share Adapted Material.
 * Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 * Term. The term of this Public License is specified in Section 6(a).
 * Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 * Downstream recipients.
 * Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 * No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 * No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 * Other rights.
 * 
 * Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 * Patent and trademark rights are not licensed under this Public License.
 * To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties.
 * Section 3 – License Conditions.
 * 
 * Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 * 
 * Attribution.
 * 
 * If You Share the Licensed Material (including in modified form), You must:
 * 
 * retain the following if it is supplied by the Licensor with the Licensed Material:
 * identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 * a copyright notice;
 * a notice that refers to this Public License;
 * a notice that refers to the disclaimer of warranties;
 * a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 * indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 * indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 * You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 * If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 * If You Share Adapted Material You produce, the Adapter's License You apply must not prevent recipients of the Adapted Material from complying with this Public License.
 * Section 4 – Sui Generis Database Rights.
 * 
 * Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 * 
 * for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database;
 * if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material; and
 * You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 * For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 * Section 5 – Disclaimer of Warranties and Limitation of Liability.
 * 
 * Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 * To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 * The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 * Section 6 – Term and Termination.
 * 
 * This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 * Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 * 
 * automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 * upon express reinstatement by the Licensor.
 * For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 * For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 * Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 * Section 7 – Other Terms and Conditions.
 * 
 * The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 * Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 * Section 8 – Interpretation.
 * 
 * For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 * To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 * No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 * Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 * Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 * 
 * Creative Commons may be contacted at creativecommons.org.
 */

package org.white_sdev.white_ffmpegclient.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import lombok.extern.slf4j.Slf4j;
import static org.white_sdev.white_validations.parameters.ParameterValidator.*;
import org.white_sdev.white_ffmpegclient.exceptions.White_FFmpegClientException;
import org.white_sdev.white_ffmpegclient.service.EncoderConfigurations;
import org.white_sdev.white_ffmpegclient.service.EncoderService;
import org.white_sdev.white_ffmpegclient.view.JFrameTerminal;
import org.white_sdev.white_ffmpegclient.view.MainJFrame;


/**
 * Controller of the Main frame that organizes and controls the functionality and validations of the MainJFrame.
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since Jul 14, 2020
 */
@Slf4j
public class MainFrameController {
    
    public final MainJFrame view;
    LinkedHashSet<JTableFile> jfiles;
    EncoderService encoderService=new EncoderService();
    
    //<editor-fold defaultstate="collapsed" desc="Methods">
    
    /**
     * Class Constructor. The constructor will initialize the view permanent link.
     * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
     * @since Jul 14, 2020
     * @param viewFrame The {@link JFrame} to assign as view of this controller to create the object.
     * @throws IllegalArgumentException - if the frame provided is null.
     */
    public MainFrameController(MainJFrame viewFrame) {
	log.trace("::MainFrameController() - Start: ");
	notNullValidation(viewFrame,"Impossible to initialize the controller. You must provide a View to interact with. viewFrame object can't be null.");
	try{
	    
	    view=viewFrame;	    

	    log.trace("::MainFrameController() - Finish: ");
	} catch (Exception e) {
            throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
        }
    }

    public void customInitComponents(){
	try {
	    JTable jTable=view.getJTableFiles();
	    //last column align to right https://stackoverflow.com/questions/3467052/set-right-alignment-in-jtable-column
	    jTable.getColumnModel().getColumn(jTable.getColumnModel().getColumnCount()-1).
		    setCellRenderer(new DefaultTableCellRenderer(){{setHorizontalAlignment(JLabel.RIGHT);}});
	    
	    DefaultTableModel tableModel= (DefaultTableModel) jTable.getModel();
	    //tableModel.setColumnIdentifiers(JTableFile.REDUNDANT_COLUMN_NAMES.toArray());
	    tableModel.addRow(new Object[]{"No Files Loaded","",0});
	    view.jPanelFFmpegPath.setVisible(false);
	    
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
        
    public void loadFiles() {
	log.trace("::loadFiles() - Start: ");
	
	try {
	    
	    
	    LinkedHashSet<File> files=getFileChooserFiles();
	    //if the user chooses any file the view should enable encoding buttons
	    if(files.size()>0) view.enableEncodingButtons();
	    jfiles=format(files);
	    loadFilesOnView(jfiles,view.getJTableFiles());
	    log.trace("::loadFiles() - Finish: ");
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    public void encode(JFrame frame) {
	log.trace("::encode() - Start: launching new Thread");
	notNullValidation(frame);
	try {
	    launchTerminal();
	    
	    log.trace("::encode() - Finish: ");
	    
	} catch (White_FFmpegClientException e) {
	    log.error("An error ocurred when trying to encode the files.", e);
	    JOptionPane.showMessageDialog( null,"An error ocurred when trying to encode the files. \n"+ e.getCauses() );
	} catch (Exception e) {
	    log.error("An error ocurred when trying to encode the files.", e);
	    JOptionPane.showMessageDialog(view,"An unexpected error has ocurred when trying to encode the files. ");
	}
    }
    
    
    public void showCommands() {
	log.trace("::showCommands() - Start: ");
	
	try {
	    
	    launchCommandsExposer();
	    
	    log.trace("::showCommands() - Finish: ");
	} catch (White_FFmpegClientException e) {
	    log.error("An error ocurred when trying to generate the commands.", e);
	    JOptionPane.showMessageDialog( null,"An error ocurred when trying to generate the commands. \n"+ e.getCauses() );
	} catch (Exception e) {
	    log.error("An error ocurred when trying to generate the commands.", e);
	    JOptionPane.showMessageDialog(view,"An error ocurred when trying to generate the commands. ");
	}
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="private">
    
    public LinkedHashSet<File> getFileChooserFiles() {
	log.trace("::getChoosedFiles() - Start: ");
	try {
	    JFileChooser fileChooser=new JFileChooser();
	    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    fileChooser.setMultiSelectionEnabled(true);

	    LinkedHashSet<File> files=new LinkedHashSet<>();
	    if (fileChooser.showOpenDialog(view) == JFileChooser.APPROVE_OPTION){
		File directoryOrFile=fileChooser.getSelectedFile();
		File[] filesArray=directoryOrFile.isDirectory()?directoryOrFile.listFiles():fileChooser.getSelectedFiles();
		files.addAll( new ArrayList<>(Arrays.asList(filesArray)) );
	    }
	    return files;
	    
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    public void loadFilesOnView(Set<JTableFile> jfiles,JTable table) {
	log.trace("::loadFilesOnView(parameter) - Start: ");
	notNullValidation(jfiles);
	notNullValidation(table);
	try {
	    
	     DefaultTableModel tableModel= (DefaultTableModel) table.getModel();
	     tableModel.setRowCount(0);
	     for(JTableFile file:jfiles) {
		 tableModel.addRow(file.getData());
	     }
	     
	    log.trace("::loadFilesOnView(parameter) - Finish: ");
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    public LinkedHashSet<JTableFile> format(Set<File> files) {
	log.trace("::format(files) - Start: ");
	if(files==null) return null;
	try {
	    
	    LinkedHashSet<JTableFile> jfiles=new LinkedHashSet<>();
	    for(File file:files){
		jfiles.add(new JTableFile(file));
	    }
	    
	    log.trace("::format(files) - Finish: "); 
	    return jfiles;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    public LinkedHashSet<File> reformat(Set<JTableFile> jFiles) {
	log.trace("::format(JTableFile) - Start: ");
	if(jFiles==null) return null;
	try {
	    
	    LinkedHashSet<File> files=new LinkedHashSet<>();
	    for(JTableFile jFile:jFiles){
		files.add(jFile.file);
	    }
	    
	    log.trace("::format(JTableFile) - Finish: "); 
	    return files;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to obtain files from the list due to an unexpected error.", e);
	}
    }
    
    public void launchTerminal() {
	log.trace("::launchTerminal() - Start: ");
	try {
	    
	    Thread terminalLauncher = new Thread() {
		@Override
		public void run(){
		    
		    try {
			JFrameTerminal terminal = new JFrameTerminal();
			terminal.pack();
			terminal.setVisible(true);
			
			loadEncoderConfigurations();
			Boolean success=executeCommands(terminal.getTerminal(), encoderService.getEncodingCommands(reformat(jfiles)) );
			
			if(!success) {
			    javax.swing.JOptionPane.showMessageDialog(null, "No commands to execute. No files selected?");
			    terminal.dispose();
			}
			

			log.trace("::encode(parameter) - Finish: ");
		    } catch (White_FFmpegClientException e) {
			log.error("An error occurred when trying to launch the terminal to show the files encoding status.", e);
			JOptionPane.showMessageDialog( null,"An error occurred when trying to launch the terminal to show the files encoding status. \n"+ e.getCauses() );
		    } catch (Exception e) {
			log.error("An error occurred when trying to encode the files.", e);
			JOptionPane.showMessageDialog(view,"An unexpected error has occurred when trying to launch the terminal. ");
		    }
		    
		}

		private Boolean executeCommands(JTextArea terminal,String [] commands) {
		    log.trace("::executeCommands(terminal,commands) - Start: ");
		    notNullValidation(terminal,"Imposible to show the command progress without a terminal. Please ensure the provided terminal is not null");
		    try {
			
			if(commands!=null && commands.length>0){
			    InputStream inputStream = Runtime.getRuntime().exec(commands).getInputStream();
			    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


			    String line;
			    while ((line = bufferedReader.readLine()) != null) {
				terminal.append(line + "\n");
				//TODO Verify if this is needed
				terminal.setCaretPosition(terminal.getDocument().getLength());
			    }
			    log.trace("::executeCommands(terminal,commands) - Finish: Success"); 
			    return true;
			}else{
			    log.trace("::executeCommands(terminal,commands) - Finish: No commands"); 
			    return false;
			}
			
			
		    } catch (Exception e) {
			throw new White_FFmpegClientException("Error when executing the encoding command(s).", e);
		    }
		}
	    };
	    terminalLauncher.start();
	    
	    log.trace("::executeCommands(terminal,commands) - Finish: ");
	    
	} catch (White_FFmpegClientException e) {
	    log.error("::executeCommands(terminal,commands) An error occurred when trying to launch the terminal to show the files encoding status.", e);
	    JOptionPane.showMessageDialog( null,"An error occurred when trying to launch the terminal to show the files encoding status. \n"+ e.getCauses() );
	} catch (Exception e) {
	    log.error("::executeCommands(terminal,commands) An error occurred when trying to encode the files.", e);
	    JOptionPane.showMessageDialog(view,"An unexpected error has occurred when trying to launch the terminal. ");
	}
    }
    
    public void loadEncoderConfigurations() {
	log.trace("::loadEncoderConfigurations() - Start: ");
	try {
	    
	    EncoderConfigurations.outputExtension=view.getExtension();
	    EncoderConfigurations.includeSubtitles=view.getJCheckBoxIncludeSubs().isEnabled();
	    EncoderConfigurations.selectedLanguage=(EncoderConfigurations.Language) view.jComboBoxDefaultLanguage.getSelectedItem();
	    if(view.jCheckBoxCustomFFmpeg.isSelected()) EncoderConfigurations.ffmpegPath=view.jTextFieldFFmpegPath.getText();
	    
	    log.trace("::loadEncoderConfigurations() - Finish: ");
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    //</editor-fold>


    
    public void launchCommandsExposer() {
	log.trace("::launchTerminal() - Start: ");
	try {
	    
	    Thread terminalLauncher = new Thread() {
		@Override
		public void run(){
		    
		    try {
			JFrameTerminal terminal = new JFrameTerminal();
			terminal.pack();
			terminal.setVisible(true);
			
			loadEncoderConfigurations();
			Boolean success=displayCommand(terminal.getTerminal(), encoderService.getEncodingCommands(reformat(jfiles)) );
			
			if(!success) {
			    javax.swing.JOptionPane.showMessageDialog(null, "No commands to show. No files selected?");
			    terminal.dispose();
			}
			

			log.trace("::encode(parameter) - Finish: ");
		    } catch (White_FFmpegClientException e) {
			log.error("An error occurred when trying to launch the terminal to show the files encoding status.", e);
			JOptionPane.showMessageDialog( null,"An error occurred when trying to launch the terminal to show the files encoding status. \n"+ e.getCauses() );
		    } catch (Exception e) {
			log.error("An error occurred when trying to encode the files.", e);
			JOptionPane.showMessageDialog(view,"An unexpected error has occurred when trying to launch the terminal. ");
		    }
		    
		}

		private Boolean displayCommand(JTextArea terminal,String [] commands) {
		    log.trace("::displayCommand(terminal,commands) - Start: ");
		    notNullValidation(terminal,"Imposible to show the command progress without a terminal. Please ensure the provided terminal is not null");
		    try {
			
			if(commands!=null && commands.length>0){
			    
			    for(var command:commands){
				terminal.append(command + "\n");
				//TODO Verify if this is needed
				terminal.setCaretPosition(terminal.getDocument().getLength());
			    }
			    
			    log.trace("::displayCommand(parameter) - Finish: Success"); 
			    return true;
			}else{
			    log.trace("::displayCommand(parameter) - Finish: No commands"); 
			    return false;
			}
			
			
		    } catch (Exception e) {
			throw new White_FFmpegClientException("Error when generating the encoding command(s).", e);
		    }
		}
	    };
	    terminalLauncher.start();
	    
	    log.trace("::launchTerminal() - Finish: ");
	    
	} catch (White_FFmpegClientException e) {
	    log.error("An error occurred when trying to launch the terminal to show the files encoding status.", e);
	    JOptionPane.showMessageDialog( null,"An error occurred when trying to launch the terminal to show the files encoding status. \n"+ e.getCauses() );
	} catch (Exception e) {
	    log.error("An error occurred when trying to encode the files.", e);
	    JOptionPane.showMessageDialog(view,"An unexpected error has occurred when trying to launch the terminal. ");
	}
    }

    public void customFFmpegPathActivated() {
	log.trace("::customFFmpegPathActivated() - Start: ");
	try {
	    view.jPanelFFmpegPath.setVisible(true);
	    log.trace("::customFFmpegPathActivated() - Finish: ");
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    
    public class JTableFile{
	public final LinkedHashSet<String> REDUNDANT_COLUMN_NAMES=new LinkedHashSet<>(){{
	    add("Include");
	    add("File Name");
	    add("Path");
	    add("Size");
	}};

	public File file;
	public String fileName;
	public String path;
	public Number size;


	JTableFile(File file) {
	    log.trace("::JTableFile(parameter) - Start: ");
	    notNullValidation(file);
	    try {
		this.file=file;
		this.fileName=file.getName();
		this.path=file.getPath();
		this.size=file.length();

	    } catch (Exception e) {
		throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	    }
	}

	public Object[] getData(){
	    return new Object[]{fileName,path, getFormattedSize() };
	}

	private String getFormattedSize() {
	    log.trace("::getFormattedSize() - Start: ");
	    try {
		
		Double sizeKB=size.longValue()/Math.pow(2,10);
		
		String sizeString=sizeKB<1?size.longValue()+" B":
			size.longValue()/Math.pow(2,20)<1? BigDecimal.valueOf(sizeKB).setScale(1,RoundingMode.HALF_UP)+"KB":
			size.longValue()/Math.pow(2,30)<1?BigDecimal.valueOf(size.longValue()/Math.pow(2,20)).setScale(1,RoundingMode.HALF_UP)+"MB":
			BigDecimal.valueOf(size.longValue()/Math.pow(2,30)).setScale(1,RoundingMode.HALF_UP)+"GB";
		
		log.trace("::getFormattedSize() - Finish: ");
		return sizeString;
		
	    } catch (Exception e) {
		throw new White_FFmpegClientException("Impossible to format the size to String due to an unknown internal error.", e);
	    }
	}

    }
    
}

